package inheritance;

class Employee{
    void work(){
        System.out.println("working");
    }
}

class Manager extends Employee{
    void attendMeeting(){
        System.out.println("attending meeting");
    }
}


public class singlevel {

    public static void main(String[] args) {
        Manager s1= new Manager();
        s1.work();
        s1.attendMeeting();

        
    }
    
}
