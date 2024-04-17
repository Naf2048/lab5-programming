package org.example.commands;
/**
 * Класс для инкапсуляции команды Exit
 * @author Daniel
 */
public class Exit implements Command{
    private final Storage storage;

    public Exit(Storage storage){
        this.storage = storage;
    }

    @Override
    public void execute(){
        storage.exit();
    }


    @Override
    public void getDescription(){
        System.out.println("Останавливает программу");
    }
}
