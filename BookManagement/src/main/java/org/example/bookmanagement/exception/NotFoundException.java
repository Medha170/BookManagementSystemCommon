package org.example.bookmanagement.exception;

public class NotFoundException extends LibraryManagementException {

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

