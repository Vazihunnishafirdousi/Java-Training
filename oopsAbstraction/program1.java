package abstraction;
 abstract class Animal{
    abstract void sound();
 }
 class Cat extends Animal{
    void sound(){
        System.out.println("meoww");
    }
 }
public class program1 {
    public static void main(String[] args) {
        Animal a1=new Cat();
        a1.sound();
        
    }
    
}
