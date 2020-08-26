package pl.patryk.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patryk.bank.dao.AdressDAO;
import pl.patryk.bank.model.Adress;
import pl.patryk.bank.service.IAdressService;

import java.util.Optional;
@Service
public class AdressService implements IAdressService {
    private AdressDAO adressDAO;

    public AdressService() {
    }

    @Autowired
    public AdressService(AdressDAO adressDAO) {
        this.adressDAO = adressDAO;
    }

    @Override
    public void save(Adress adress) {
        this.adressDAO.save(adress);
    }

    @Override
    public Optional<Adress> findById(Long id) {
        return this.adressDAO.findById(id);
    }

    @Override
    public void delete(Adress adress) {
        this.adressDAO.delete(adress);
    }

    @Override
    public void deleteById(Long id) {
        this.adressDAO.deleteById(id);
    }
}
