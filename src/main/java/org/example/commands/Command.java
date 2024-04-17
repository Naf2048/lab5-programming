package org.example.commands;
/**
 * интерфейс для всех команд реализованных в приложении
 */

public interface Command {
    public void execute();
    public void getDescription();
}
