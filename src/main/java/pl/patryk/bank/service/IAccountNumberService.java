package pl.patryk.bank.service;

import pl.patryk.bank.model.AccountNumber;

import java.util.Optional;

public interface IAccountNumberService {
    void save(AccountNumber accountNumber);
    Optional<AccountNumber> findById(Long id);
    void delete(AccountNumber accountNumber);
    void deleteById(Long id);
}
