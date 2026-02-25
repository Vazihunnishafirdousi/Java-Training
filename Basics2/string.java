package Basics2;

public class string {
    public static void main(String[] args) {
    String s1 ="hello";
    /*for(int i=0; i<s1.length(); i++){
        System.out.println(s1.charAt(i));
    }

     for(int i=s1.length()-1; i>=0; i--){
        System.out.println(s1.charAt(i));
    }*/
        String rev="";
        for(int i=s1.length()-1; i>=0; i--){
        rev= rev+s1.charAt(i);
        }
        System.out.println(rev);
        if(s1.equals(rev)){
           // System.out.println(s1+"it is pallindrome");
        }
       

     
        

    }
    
}
