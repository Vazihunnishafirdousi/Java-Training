package abstraction;
abstract class Shape{
    abstract void area();
}

class circle extends Shape{
    void area(){
        System.out.println("3.14*r*r");
    }
}
class rectangle extends Shape{
    void area(){
        System.out.println("length *breadth");
    }
}
public class program2 {
    public static void main(String[] args) {
        Shape s1 = new circle();
        Shape s2=new rectangle();
        s1.area();
        s2.area();
        
        
    }
    
}
