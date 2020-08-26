package pl.patryk.bank.hacks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import pl.patryk.bank.model.AccountNumber;
import pl.patryk.bank.model.BankAccount;
import pl.patryk.bank.model.User;
import pl.patryk.bank.model.enums.BankAccountType;
import pl.patryk.bank.service.IAccountNumberService;
import pl.patryk.bank.service.IBankAccountService;
import pl.patryk.bank.service.IUserService;

@Controller
public class HacksController {
    @Autowired
    public IBankAccountService bankAccountService;
    @Autowired
    IUserService userService;
    @Autowired
    IAccountNumberService accountNumberService;
    @GetMapping("/hax")
    public String getHacked() {

            User user = new User();
            user.setLogin("xxx");
            user.setPassword("xxx");
            user.setName("Patryk");
            BankAccount ba = new BankAccount();
            ba.setType(BankAccountType.NORMAL);
            ba.setOwner(user);
            ba.setBalance(1000.0);

            AccountNumber accountNumber = new AccountNumber();
            accountNumber.setAccNumber("17000000000000000000000001");
            accountNumber.setBankAccount(ba);
            ba.setAccountNumber(accountNumber);


            BankAccount sav = new BankAccount();
            sav.setType(BankAccountType.SAVINGS);
            sav.setOwner(user);
            sav.setBalance(100.0);

            AccountNumber accountNumber2 = new AccountNumber();
            accountNumber2.setAccNumber("17000000000000000000000002");
            accountNumber2.setBankAccount(sav);
            user.getAccounts().add(ba);
            user.getAccounts().add(sav);

            userService.saveUser(user);
            bankAccountService.save(ba);
            bankAccountService.save(sav);



            User user2 = new User();
            user2.setLogin("xxxx");
            user2.setPassword("xxxx");
            user2.setName("Patrxyk");
            BankAccount ba2 = new BankAccount();
            ba2.setType(BankAccountType.NORMAL);
            ba2.setOwner(user2);
            ba2.setBalance(1500.0);
            AccountNumber accountNumber3 = new AccountNumber();
            accountNumber3.setAccNumber("17000000000000000000000003");
            accountNumber3.setBankAccount(ba2);
            ba2.setAccountNumber(accountNumber3);

            BankAccount sav2 = new BankAccount();
            sav2.setType(BankAccountType.SAVINGS);
            sav2.setOwner(user2);
            sav2.setBalance(105.0);
            AccountNumber accountNumber4 = new AccountNumber();
            accountNumber4.setAccNumber("17000000000000000000000002");
            accountNumber4.setBankAccount(sav2);
            sav2.setAccountNumber(accountNumber4);
            user2.getAccounts().add(ba2);
            user2.getAccounts().add(sav2);


            userService.saveUser(user2);
            bankAccountService.save(ba2);
            bankAccountService.save(sav2);

            return "index";

    }
}
