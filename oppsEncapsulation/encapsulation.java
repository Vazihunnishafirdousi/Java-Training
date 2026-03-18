package encapsulation;

class Atm{
    private int paise;
    public Atm(int r){
        this.paise=r;
    }
    public int gatter(int r){
        return paise;
    }
}
public class encapsulation {
    public static void main(String[] args) {
        Atm s1=new Atm(500);
        System.out.println(s1.gatter(20));
        
    }
    
}
