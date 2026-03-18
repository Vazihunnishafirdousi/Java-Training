package inheritance;


class Cat{
    void eat(){
        System.out.println("eating");
    }
}

class Horse extends Cat{
    void walk(){
        System.out.println("run");
    }
}

class Goat extends Cat{
    void play(){
        System.out.println("jump");
    }
}


public class hybridinheritance {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        Goat g1 = new Goat();
        h1.eat();
        h1.walk();
        g1.eat();
        g1.play();

        
    }
    
}
