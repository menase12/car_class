package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle_Class name=new Vehicle_Class();
        Other_vehicle name1= new Other_vehicle();
        name.setName("Porsche");
        name.setColor("red");
        name1.setName("Jetta");
        name1.setColor("blue");
        //System.out.println("This is a "+name.getColor()+" "+name.getName()+" car.\n");
        System.out.println(name.starting());
        System.out.println(name1.starting());
        System.out.println(name.accelerating());
        System.out.println(name1.accelerating());
        System.out.println(name1.going());
        System.out.println(name1.pass());
        System.out.println(name.going());
        System.out.println(name.stop());
        System.out.println(name1.stop());
    }
}
