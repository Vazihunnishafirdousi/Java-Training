package oops;

class Rectangle{
    int length;
    int breadth;
    void calculate(){
        int area=length*breadth;
        System.err.println(area);
        
        int parameter=2*(length+breadth);
        System.out.println(parameter);

    }
}
public class program2 {
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        r1.length=2;
        r1.breadth=3;


        Rectangle r2=new Rectangle();
        r2.length=3;
        r2.breadth=5;

        r1.calculate();
        r2.calculate();
        
    }
    
}
