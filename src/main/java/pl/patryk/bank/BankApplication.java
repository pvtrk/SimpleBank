package pl.patryk.bank;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.patryk.bank.utils.AccountNumberManager;


@SpringBootApplication
public class BankApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(BankApplication.class, args);

        AccountNumberManager anm = new AccountNumberManager();
        System.out.println(anm.generateNumber(1700000000000L,1000000000000L));

    }
}
