package pl.patryk.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patryk.bank.model.AccountNumber;
@Repository
public interface AccountNumberDAO extends JpaRepository<AccountNumber, Long> {
}
