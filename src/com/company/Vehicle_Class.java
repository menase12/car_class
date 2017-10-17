package com.company;

public class Vehicle_Class {
    //public class Car_Class{
        private String carName;
        private String color;

public String getName(){
        return carName;
    }
public void  setName(String value){
    carName=value;
}
public String getColor(){
    return color;
}
    public void setColor(String value){
        color=value;
    }
public String starting()
    {
        return "The red Porsche is starting";

    }
    public String accelerating(){

        return "The red Porsche is accelerating" ;}

public String going(){
    
    return "The red Porsche is going 50 mph" ;

}
    public String stop(){

        return "The red Porsche is stopped";
    }

    }

