package polymorphism;

class Animal{
    void sound(){
        System.out.println("animal");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dog");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("meow");
    }
}
public class methodoverriding {
    
    public static void main(String[] args) {
        Animal a1=new Dog();
        a1.sound();
        
    }
}
