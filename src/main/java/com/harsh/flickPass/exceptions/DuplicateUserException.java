package com.harsh.flickPass.exceptions;

public class DuplicateUserException extends Exception {
    public DuplicateUserException() {
        super();
    }

    public DuplicateUserException(String message) {
        super(message);
    }
}
