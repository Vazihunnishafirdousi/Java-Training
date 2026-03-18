package encapsulation;

class Student{
     //private String name; 
     private float marks;
     public Student(float m){
        this.marks=m;
     }
     float gatter(float a){
        return marks;
     }

     float setter(float b){
        return marks;
     }
}

public class program3 {
    public static void main(String[] args) {
        Student s1=new Student(89);
        System.out.println(s1.gatter(89));
        System.out.println(s1.setter(1));
        
    }
    
}
