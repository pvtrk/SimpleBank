package pl.patryk.bank.service;

import pl.patryk.bank.model.Transaction;

import java.util.Optional;

public interface ITransactionService {
    void save(Transaction transaction);
    Optional<Transaction> findById(Long id);
    void delete(Transaction transaction);
    void deleteById(Long id);

    boolean validateAndProcess(Transaction transaction);
}
