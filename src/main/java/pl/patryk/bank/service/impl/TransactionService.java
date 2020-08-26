package pl.patryk.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patryk.bank.dao.TransactionDAO;
import pl.patryk.bank.model.Transaction;
import pl.patryk.bank.model.enums.TransactionStatus;
import pl.patryk.bank.service.IBankAccountService;
import pl.patryk.bank.service.ITransactionService;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class TransactionService implements ITransactionService {
    private TransactionDAO transactionDAO;
    private IBankAccountService bankAccountService;

    public TransactionService() {
    }

    @Autowired
    public TransactionService(TransactionDAO transactionDAO, IBankAccountService bankAccountService) {
        this.transactionDAO = transactionDAO;
        this.bankAccountService = bankAccountService;
    }

    @Override
    public void save(Transaction transaction) {
        this.transactionDAO.save(transaction);
    }

    @Override
    public Optional<Transaction> findById(Long id) {
        return this.transactionDAO.findById(id);
    }

    @Override
    public void delete(Transaction transaction) {
        this.transactionDAO.delete(transaction);
    }

    @Override
    public void deleteById(Long id) {
        this.transactionDAO.deleteById(id);
    }

    @Override
    public boolean validateAndProcess(Transaction transaction) {
        if(transaction.getAmount() < 0 ||
                transaction.getAmount() > transaction.getSender().getBalance()) {
            return false;
        }
        this.bankAccountService.makeTransaction(transaction.getSender(),
                transaction.getReceiver(), transaction.getAmount());
        transaction.setDate(LocalDateTime.now());
        transaction.setStatus(TransactionStatus.DONE);
        this.save(transaction);
        return true;
    }
}
