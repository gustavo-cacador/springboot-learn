package br.com.gustavo.dslearn.services.exceptions;

public class EmailException extends RuntimeException {
    public EmailException(String msg) {
        super(msg);
    }
}
