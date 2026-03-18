package Iinterface;
interface vechile{
    void run();
}
interface car{
    void run();
    void model(int a);
}
class color implements vechile,car{
    public void run(){
        System.out.println("Maruti");

    }
    public void model(int a){
        System.out.println(a);
    }
}
public class program2 {
    public static void main(String[] args) {
        color c1 =new color();
        c1.run();
        c1.model(2);
        
    }
    
}
