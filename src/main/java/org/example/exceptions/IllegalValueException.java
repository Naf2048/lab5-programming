package org.example.exceptions;

public class IllegalValueException extends RuntimeException {
    public IllegalValueException(String text){
        super(text);
    }
}
