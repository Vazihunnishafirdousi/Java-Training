package Basics2;

class Student{
    int rollN;
    String name;
      public Student(int rollN, String name){
        this.rollN= rollN;
        this.name= name;
      }

    void details(){
        System.out.println(rollN + " "+name);

      }
}

public class contructor {
    public static void main(String[] args) {
        Student s1 =new Student(5,"khushi");
        s1.details();
        
    }
    

    
}
