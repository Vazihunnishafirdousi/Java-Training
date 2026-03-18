package inheritance;

class Animal{
    String color ="red";
}

class Dog extends Animal{
    String color ="green";
    void print(){
        System.out.println(color);
        System.out.println(super.color);
    }
}
public class superkey {
    public static void main(String[] args) {
        Dog s1 =new Dog();
        s1.print();
    }
    
}
