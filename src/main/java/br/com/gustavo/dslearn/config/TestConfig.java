package br.com.gustavo.dslearn.config;

import br.com.gustavo.dslearn.services.EmailService;
import br.com.gustavo.dslearn.services.MockEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {
    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }
}
