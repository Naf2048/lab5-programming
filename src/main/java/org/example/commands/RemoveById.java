package org.example.commands;
/**
 * Класс для инкапсуляции команды RemoveById
 * @author Daniel
 */

public class RemoveById implements Command {
    private final Storage storage;
    private int id;
    public RemoveById(Storage storage) {
        this.storage = storage;
    }

    public void setId(int id){
        this.id = id;
    }

    @Override
    public void execute(){
        try{
            storage.remove_by_id();
        } catch (NumberFormatException e){
            throw e;
        }
    }

    @Override
    public void getDescription(){
        System.out.println("Удаляет элемент с заданным Id.");
    }
}
