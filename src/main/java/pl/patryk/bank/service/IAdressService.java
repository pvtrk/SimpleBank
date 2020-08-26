package pl.patryk.bank.service;



import pl.patryk.bank.model.Adress;

import java.util.Optional;

public interface IAdressService {
    void save(Adress adress);
    Optional<Adress> findById(Long id);
    void delete(Adress adress);
    void deleteById(Long id);
}
