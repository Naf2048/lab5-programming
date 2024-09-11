package org.example.myClasses;


public class Location {
    private int x;
    private Long y; //Поле не может быть null
    private int z;
    private String name; //Строка не может быть пустой, Поле может быть null

    public Location(int x, Long y, int z, String name) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }

    public void setLocationX(int x){
        this.x = x;
    }

    public void setLocationY(Long y){
        this.y = y;
    }

    public void setLocationZ(int z){
        this.z = z;
    }

    public int getLocationX(){
        return this.x;
    }

    public long getLocationY(){
        return this.y;
    }

    public int getLocationZ(){
        return this.z;
    }

    public void setLocationName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Location name: " + this.name + ", x: " + this.x + ", y: " + this.y + ", z: " + this.z;
    }

}