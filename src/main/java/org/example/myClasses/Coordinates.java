package org.example.myClasses;

import org.example.exceptions.IllegalValueException;
import org.example.data.*;
public class Coordinates {
    /**
     * Поле для координаты x
     */
    private Long x;
    /**
     * Поле для координаты y
     */
    private int y; //Значение поля должно быть больше -735

    /**
     * Конструктор
     * @param x
     * @param y
     */
    public Coordinates(Long x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Получение координаты x
     * @return x
     */
    public Long getX() {
        return x;
    }

    /**
     * Получение координаты y
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * @return строку для вывода
     */
    @Override
    public String toString() {
        return "{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

