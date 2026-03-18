package Iinterface;

// abstract class Animal{
//     abstract void sound();
//     void run(){
//         System.out.println("jhf");

//     }
// }
// class cat extends Animal{
//     void sound(){
//         System.out.println("meowww");
//     }
// }

 interface Animal {//by default public
    void run();  
}

class Dog implements Animal{ //here we wrote public & use implemnts for interface
    public void run(){
        System.out.println("run");
    }
}

public class program1 {
    public static void main(String[] args) {
        Animal s1 =  new Dog(); 
        s1.run();
        
        
    }
}
