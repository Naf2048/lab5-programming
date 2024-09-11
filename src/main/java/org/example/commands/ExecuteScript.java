package org.example.commands;
/**
 * Класс для инкапсуляции команды ExecuteScript
 * @author Daniel
 */

public class ExecuteScript implements Command{
    private Storage storage;

    public ExecuteScript(Storage storage) {
        this.storage = storage;
    }


    @Override
    public void execute() {
        storage.execute_script();
    }

    @Override
    public void getDescription() {
        System.out.println("Исполняет скрипт.");
    }
}
