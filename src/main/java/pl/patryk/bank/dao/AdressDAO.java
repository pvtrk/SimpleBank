package pl.patryk.bank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patryk.bank.model.Adress;
@Repository
public interface AdressDAO extends JpaRepository<Adress, Long> {
}
