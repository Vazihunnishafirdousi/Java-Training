package encapsulation;

class BankAccount{
    private float Balance;
    public BankAccount( float b){
        this.Balance=b;
    }
    float gatter(float a){
        return Balance;
    }
    float setter(float c){
        return Balance;
    }
    
}

public class program2 {
    public static void main(String[] args) {
        BankAccount b1= new BankAccount(3000);
       System.out.println( b1.gatter(200));
       System.out.println( b1.setter(100));
        
    }
    
}
