package org.example.bookmanagement.exception;

public class LibraryManagementException extends RuntimeException{

    public LibraryManagementException(String message) {
        super(message);
    }

    public LibraryManagementException(String message, Throwable cause) {
        super(message, cause);
    }
}
