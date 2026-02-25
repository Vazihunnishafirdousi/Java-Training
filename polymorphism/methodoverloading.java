package polymorphism;

class Main{
    void add(){
        System.out.println("hello");
    }

    void add(int a){
        System.out.println("sum");

    }
    void add(int a,int b){
        System.out.println(a+b);

    }
}


public class methodoverloading {
    public static void main(String[] args) {
        Main s1= new Main();
        s1.add();
        s1.add(5);
        s1.add(5,6);
        
    }
    
}
