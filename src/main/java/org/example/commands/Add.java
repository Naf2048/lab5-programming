package org.example.commands;

import org.example.exceptions.*;
import org.example.myClasses.*;


import java.io.IOException;
import java.util.InputMismatchException;
/**
 * Класс для инкапсуляции команды Add
 * @author Daniel
 */
public class Add implements Command {
    private Storage storage;
    private StreamReader streamReader;

    public Add(Storage storage, StreamReader streamReader){
        this.storage = storage;
        this.streamReader = streamReader;
    }

    @Override
    public void execute() {
        try{
            storage.add(streamReader);
        }catch (IOException | NotValidFileException | InputMismatchException e){
            System.out.println(e.toString());
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void getDescription(){
        System.out.println("Добавляет элемент в коллекцию.");
    }

}