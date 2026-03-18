package oops;

class Student{
    String name;
    int rollnum;
    int marks;

    void details(){
        System.out.println(name);
        System.out.println(rollnum);
        System.out.println(marks);
    }
}

public class program1 {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="khushi";
        s1.rollnum=230;
        s1.marks=81;

        Student s2= new Student();
        s2.name = "Muskan";
        s2.rollnum=267;
        s2.marks=78;

        Student s3 = new Student();
        s3.name="nisha";
        s3.rollnum= 100;
        s3.marks= 86;

        s1.details();
        s2.details();
        s3.details();

        
    }
    
}
