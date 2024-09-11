package org.example.commands;
/**
 * Класс для инкапсулирования команды Show
 * @author Daniel
 */

public class Show implements Command {
    private final Storage storage;

    public Show(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void execute() {
        storage.show();
    }

    @Override
    public void getDescription(){
        System.out.println("Показывает содержимое коллекции.");
    }
}