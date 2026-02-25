package Basics;

public class program1 {
    public static void main(String[] args) {
        int a= 121;
        int sum =0;
        for(int i =1; i<=3; i++){
            sum = sum + i;
        }
        System.out.println(sum);


       //checking is it pallindrome or not
        int temp = a;
        int revNum =0;
        while (temp>0){
            int digit = temp%10;
            revNum = revNum*10 + digit;
            temp = temp/10;
        }

        if(a == revNum){
            System.out.println("pallindrome");
        }else{
            System.out.println("not  pallindrome");
        }
        
    }
}
