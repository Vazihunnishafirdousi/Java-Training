package inheritance;

class Animal{
        void eat(){
            System.out.println("pizza");
        }
    }

    class Dog extends Animal{
        void bark(){
            System.out.println("booo");
        }
    }

    class Puppy extends Dog{
        void play(){
            System.out.println("football");
        }
    }

public class inheritance {
    public static void main(String[] args) {
        Dog s1 = new Dog();
        Puppy p1 = new Puppy();
        s1.bark();
        s1.eat();
        p1.bark();
        p1.eat();

        
    }
    
}
