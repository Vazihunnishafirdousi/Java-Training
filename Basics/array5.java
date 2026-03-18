package Basics;

//import java.util.Scanner;

public class array5 {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,10,12};
        int l=0; 
        int r=arr.length-1;
        int target= 15;
        
        int flag=0;
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum== target){
                System.out.println("pair found :" + arr[l]+ ","+arr[r] );
                flag=1;
                l++;
                r--;
            }
        
        else if(sum>target){
            r--;
        }else{
            l++;
        }
        
    }
    if(flag==0){
        System.out.println("not found");
     
    } 
}  
}

 
