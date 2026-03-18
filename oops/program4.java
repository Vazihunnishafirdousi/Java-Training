// Create a class Car with fields brand, model, and price. Write a method to display car details.
//Create multiple objects and display info.
package oops;

class Car{
    String brand;
    int model;
    int price;

    void details(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(price);
    }
}

public class program4{
    public static void main(String [] args){
        Car c1=new Car();
        c1.brand="Maruti";
        c1.model=2;
        c1.price=500000;

        Car c2=new Car();
        c2.brand="Tata";
        c2.model=1;
        c2.price=260000;

        c1.details();
        c2.details();


    }
}


