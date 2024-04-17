package org.example.myClasses;

/**
 * класс для создания id
 * @author Daniel
 */
public class Id {
    /**
     * Статическое поле id для получения его для {@link Movie}
     */
    public static long  id = 0;

    /**
     * Увеличение id с возвращением его нового значения
     * @return id
     */
    public static long incAndGet(){
        return ++id;
    }

    /**
     * Метод для умиеньшения id на 1
     */
    public static void decId(){
        id -= 1;
    }
}
