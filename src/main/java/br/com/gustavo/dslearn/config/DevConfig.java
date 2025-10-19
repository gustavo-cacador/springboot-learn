package br.com.gustavo.dslearn.config;

import br.com.gustavo.dslearn.services.EmailService;
import br.com.gustavo.dslearn.services.SendGridEmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class DevConfig {
    @Bean
    public EmailService emailService() {
        return new SendGridEmailService();
    }
}
