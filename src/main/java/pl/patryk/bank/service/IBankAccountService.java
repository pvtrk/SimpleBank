package pl.patryk.bank.service;

import pl.patryk.bank.model.BankAccount;

import java.util.Optional;

public interface IBankAccountService {
    void save(BankAccount account);
    Optional<BankAccount> findById(Long id);
    void delete(BankAccount account);
    void deleteById(Long id);
    void makeTransaction(BankAccount sender, BankAccount receiver, double amount);
    BankAccount getBankAccountByAccountNumber(String value);
}
