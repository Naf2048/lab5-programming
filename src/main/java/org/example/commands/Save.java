package org.example.commands;

import java.io.File;
import java.io.FileNotFoundException;

/** класс для инкапсулирования комманды save
 * @author Daniel
 */
public class Save implements Command{
    private final Storage storage;
    private final File file;

    public Save(Storage storage, File file) {
        this.storage = storage;
        this.file = file;
    }

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
        System.out.println("Сохранение коллекции в файл.");
    }
}
