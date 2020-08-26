package pl.patryk.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patryk.bank.dao.BankAccountDAO;
import pl.patryk.bank.model.BankAccount;
import pl.patryk.bank.service.IBankAccountService;

import java.util.Optional;

@Service
public class BankAccountService implements IBankAccountService {
    private BankAccountDAO accountDAO;

    public BankAccountService() {
    }

    @Autowired
    public BankAccountService(BankAccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public void save(BankAccount account) {
        this.accountDAO.save(account);
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        return this.accountDAO.findById(id);
    }

    @Override
    public void delete(BankAccount account) {
        this.accountDAO.delete(account);
    }

    @Override
    public void deleteById(Long id) {
        this.accountDAO.deleteById(id);
    }

    @Override
    public void makeTransaction(BankAccount sender, BankAccount receiver, double amount) {
        sender.setBalance(sender.getBalance() - amount);
        receiver.setBalance(receiver.getBalance() + amount);
        this.save(sender);
        this.save(receiver);
    }

    @Override
    public BankAccount getBankAccountByAccountNumber(String value) {
        BankAccount bankAccount = accountDAO.getBankAccountByAccountNumber(value);
        if(bankAccount == null) {
            return null;
        }
        return bankAccount;
    }
}
