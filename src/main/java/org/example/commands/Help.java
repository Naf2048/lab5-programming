package org.example.commands;
/**
 * Класс для инкапсуляции команды Help
 * @author Daniel
 */
public class Help implements Command{
    private final Storage storage;

    public Help(Storage storage){
        this.storage = storage;
    }

    @Override
    public void execute(){
        storage.help();
    }


    @Override
    public void getDescription(){
        System.out.println("Выводит то, что делают каналы");
    }
}
