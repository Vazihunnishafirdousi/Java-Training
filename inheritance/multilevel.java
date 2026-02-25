package inheritance;

class Person{
    void displayName(){
        System.out.println("khushi");
    }
}
class Student extends Person{
    void displayClass(){
        System.out.println("standard 12");
    }
}

class Moniter extends Student{
    void checkdiscipline(){
        System.out.println("well discipined");
    }
}


public class multilevel {
    public static void main(String[] args) {
        Moniter m1= new Moniter();
        m1.displayName();
        m1.displayClass();
        m1.checkdiscipline();
        
        
    }
    
}
