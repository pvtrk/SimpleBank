package pl.patryk.bank.service;

import pl.patryk.bank.utils.AccountNumberManager;

public interface IAccountNumberManagerService {
    AccountNumberManager getAccountNumberManager();
    void update(AccountNumberManager anm);
    String generateNextAccNumber();
}
