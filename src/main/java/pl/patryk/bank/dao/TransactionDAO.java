package pl.patryk.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patryk.bank.model.Transaction;

@Repository
public interface TransactionDAO extends JpaRepository<Transaction, Long> {
}
