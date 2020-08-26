package pl.patryk.bank.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;
import pl.patryk.bank.session.SessionObject;

@Configuration
public class AppConfig {
    @Bean
    @SessionScope
    public SessionObject sessionObject() {
        return new SessionObject();
    }
}
