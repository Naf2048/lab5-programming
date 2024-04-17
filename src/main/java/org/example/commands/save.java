package org.example.commands;

import java.io.File;
import java.io.FileNotFoundException;

public class save implements Command{
    private final Storage storage;
    private final File file;


    @Override
    public void execute() {
        try{
            storage.save(file);
        }catch(FileNotFoundException e){
            System.out.println(e.toString());
        }
    }

    @Override
    public void getDescription() {

    }
}
