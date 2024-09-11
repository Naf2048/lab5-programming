package org.example.myClasses;

import java.util.*;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.util.Date birthday; //Поле не может быть null
    private Location location ; //Поле может быть null

    public Person(String name, java.util.Date birthday, Location location) {
        this.name = name;
        this.birthday = birthday;
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setLocation(){
        this.location = location;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", location=" + location +
                '}';
    }
}
