package pl.patryk.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patryk.bank.utils.AccountNumberManager;

@Repository
public interface AccountNumberManagerDAO extends JpaRepository<AccountNumberManager, Long> {
}
