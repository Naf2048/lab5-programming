package org.example.exceptions;

public class NotValidFileException extends RuntimeException{
    public NotValidFileException(String reason){
        super("Non valid " + reason);
    }
}
