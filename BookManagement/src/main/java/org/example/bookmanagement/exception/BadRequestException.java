package org.example.bookmanagement.exception;

public class BadRequestException  extends LibraryManagementException{

    public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
