package Basics2;
 class Circle{
    double area;
    double circumference;
     public Circle(int a, int c){
        area = 3.14*a*a;
        circumference=2*3.14*c;

     }
        void calculation(){
            System.out.println(area+"  area of circle");
            System.out.println(circumference + "circumfernce of circle");
        }
    

    
    }
public class constructor2 {
    public static void main(String[] args) {
        Circle s1 = new Circle(4, 4);
        s1.calculation();
    }
    
}
 