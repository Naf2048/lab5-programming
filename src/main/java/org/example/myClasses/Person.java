package org.example.myClasses;

import java.time.LocalDateTime;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private java.time.LocalDateTime birthday; //Поле не может быть null
    private Location location ; //Поле может быть null

    public Person(String name, LocalDateTime birthday, Location location) {
        this.name = name;
        this.birthday = birthday;
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public void setLocation(){
        this.location = location;
    }
}
