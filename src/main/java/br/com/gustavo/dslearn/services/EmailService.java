package br.com.gustavo.dslearn.services;

import br.com.gustavo.dslearn.dto.EmailDTO;

public interface EmailService {
    void sendEmail(EmailDTO dto);
}
