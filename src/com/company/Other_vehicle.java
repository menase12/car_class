package com.company;
public class Other_vehicle {

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
        return "The blue Jetta is starting";

    }
    public String accelerating(){

        return "The blue Jetta is accelerating" ;}

    public String going(){

        return "The blue Jetta has stoped to have its emission closed" ;

    }
    public String pass(){
        return "The blue Jetta passes its emission test.";
    }
    public String stop(){

        return "The blue Jetta just passed the red Porsche";
    }

}

