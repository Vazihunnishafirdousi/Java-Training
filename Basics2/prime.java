package Basics2;

public class prime {
    void primeno(){

        for(int n=2;n<=10;n++){
          if(n<=1){
            continue;
           }
            boolean isprime = true;
            for(int i=2; i<=10;i++ ){
                if(n%i==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        prime s1 = new prime();
        s1.primeno();
    }
    
}
