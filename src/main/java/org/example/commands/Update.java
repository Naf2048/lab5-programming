package org.example.commands;

import org.example.exceptions.*;
import org.example.myClasses.*;

import java.io.IOException;
import java.util.InputMismatchException;

/**
 * Класс для инкапсулирования команды Update
 * @author Daniel
 */
public class Update implements Command {
    private final Storage storage;
    private final StreamReader streamReader;

    public Update(Storage storage, StreamReader streamReader) {
        this.storage = storage;
        this.streamReader = streamReader;
    }
    @Override
    public void execute() {
        try{
            storage.update(streamReader);
        }catch (IOException | NotValidFileException | InputMismatchException e){
            System.out.println(e.toString());
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void getDescription(){
        System.out.println("Обновляет элемент по указанному ID.");
    }

}
