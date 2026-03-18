// Create a class Circle with radius. Write methods to calculate area and circumference of the circle.

package oops;

class Circle{
    int r;
    
    void calculate(){
        double area = 3.14*r*r;
        System.out.println("the area of circle " + area);

        double circumference =2*3.14*r;
        System.out.println("the circumference of cirlce " + circumference);
    }
}

public class program5 {
    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.r=7;

        Circle c2 = new Circle();
        c2.r= 4;
        
        c1.calculate();
        c2.calculate();
    }
    
}
