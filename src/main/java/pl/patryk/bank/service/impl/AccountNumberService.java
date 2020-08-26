package pl.patryk.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patryk.bank.dao.AccountNumberDAO;
import pl.patryk.bank.model.AccountNumber;
import pl.patryk.bank.service.IAccountNumberService;

import java.util.Optional;

@Service
public class AccountNumberService implements IAccountNumberService {
    private AccountNumberDAO accountNumberDAO;

    public AccountNumberService() {
    }

    @Autowired
    public AccountNumberService(AccountNumberDAO accountNumberDAO) {
        this.accountNumberDAO = accountNumberDAO;
    }

    @Override
    public void save(AccountNumber accountNumber) {
        this.accountNumberDAO.save(accountNumber);
    }

    @Override
    public Optional<AccountNumber> findById(Long id) {
        return this.accountNumberDAO.findById(id);
    }

    @Override
    public void delete(AccountNumber accountNumber) {
        this.accountNumberDAO.delete(accountNumber);
    }

    @Override
    public void deleteById(Long id) {
        this.accountNumberDAO.deleteById(id);
    }
}
