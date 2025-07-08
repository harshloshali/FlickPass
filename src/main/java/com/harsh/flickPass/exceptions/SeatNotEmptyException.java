package com.harsh.flickPass.exceptions;

public class SeatNotEmptyException extends Exception {
    public SeatNotEmptyException() {
        super();
    }

    public SeatNotEmptyException(String message) {
        super(message);
    }
}
