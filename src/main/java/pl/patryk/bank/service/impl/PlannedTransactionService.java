package pl.patryk.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patryk.bank.dao.PlannedTransactionDAO;
import pl.patryk.bank.model.PlannedTransaction;
import pl.patryk.bank.service.IPlannedTransactionService;

import java.util.Optional;

@Service
public class PlannedTransactionService implements IPlannedTransactionService {
    private PlannedTransactionDAO plannedTransactionDAO;

    public PlannedTransactionService() {
    }

    @Autowired
    public PlannedTransactionService(PlannedTransactionDAO plannedTransactionDAO) {
        this.plannedTransactionDAO = plannedTransactionDAO;
    }

    @Override
    public void saveUser(PlannedTransaction plannedTransaction) {
        this.plannedTransactionDAO.save(plannedTransaction);
    }

    @Override
    public Optional<PlannedTransaction> findById(Long id) {
        return this.plannedTransactionDAO.findById(id);
    }

    @Override
    public void delete(PlannedTransaction plannedTransaction) {
        this.plannedTransactionDAO.delete(plannedTransaction);
    }

    @Override
    public void deleteById(Long id) {
        this.plannedTransactionDAO.deleteById(id);
    }
}
