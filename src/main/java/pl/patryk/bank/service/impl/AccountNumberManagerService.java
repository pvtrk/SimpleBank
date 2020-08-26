package pl.patryk.bank.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.patryk.bank.dao.AccountNumberManagerDAO;
import pl.patryk.bank.service.IAccountNumberManagerService;
import pl.patryk.bank.utils.AccountNumberManager;

@Service
public class AccountNumberManagerService implements IAccountNumberManagerService {
    private AccountNumberManagerDAO anmDAO;

    public AccountNumberManagerService() {
    }

    @Autowired
    public AccountNumberManagerService(AccountNumberManagerDAO acmDAO) {
        this.anmDAO = acmDAO;
    }

    @Override
    public AccountNumberManager getAccountNumberManager() {
        return this.anmDAO.getOne(1L);
    }

    @Override
    public void update(AccountNumberManager anm) {
        if(anm.getId() == 1) {
            this.anmDAO.save(anm);
        }
    }

    @Override
    public String generateNextAccNumber() {
        AccountNumberManager anm = getAccountNumberManager();
        String accNum =  anm.generateNumber(anm.getFirstPart(), anm.getSecondPart());
        update(anm);
        return accNum;
    }
}
