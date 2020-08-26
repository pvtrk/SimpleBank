package pl.patryk.bank.service;

import pl.patryk.bank.model.PlannedTransaction;

import java.util.Optional;

public interface IPlannedTransactionService {
    void saveUser(PlannedTransaction plannedTransaction);
    Optional<PlannedTransaction> findById(Long id);
    void delete(PlannedTransaction plannedTransaction);
    void deleteById(Long id);
}
