package org.example.commands;
/**
 * Класс для реализации инкапсулирования команды Clear
 * @author Daniel
 */

public class Clear implements Command {
    private final Storage storage;

    public Clear(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        storage.clear();
    }

    @Override
    public void getDescription(){
        System.out.println("Очищает коллекцию.");
    }
}