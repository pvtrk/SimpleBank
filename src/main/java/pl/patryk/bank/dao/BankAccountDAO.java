package pl.patryk.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pl.patryk.bank.model.BankAccount;

@Repository
public interface BankAccountDAO extends JpaRepository<BankAccount, Long> {
    @Query("SELECT b from tbankaccount b WHERE b.accountNumber =:accNumber")
    BankAccount getBankAccountByAccountNumber(@Param("accNumber") String accNumber);
}
