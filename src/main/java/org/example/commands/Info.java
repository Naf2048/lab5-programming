package org.example.commands;
/**
 * Класс для инкапсуляции команды Info
 * @author Daniel
 */
public class Info implements Command {
    private final Storage storage;

    public Info(Storage storage){
        this.storage = storage;
    }

    @Override
    public void execute(){
        storage.info();
    }


    @Override
    public void getDescription(){
        System.out.println("Выводит информацию о коллекции в командную строку");
    }
}
