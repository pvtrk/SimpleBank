package pl.patryk.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patryk.bank.model.PlannedTransaction;
@Repository
public interface PlannedTransactionDAO extends JpaRepository<PlannedTransaction, Long> {
}
