package pl.patryk.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patryk.bank.model.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {
}
