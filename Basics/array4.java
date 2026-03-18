package Basics;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of the elements:");
        int n = sc.nextInt();
        int arr[]=  new int[n];

        int temp=0;
        int max= arr[n-1];
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>=max){
                max= arr[i];
                temp = max;
                temp++;
                
            }

        }
         for(int k =0; k<temp;k++){
            System.out.println(temp + "");
         }

    }
    
    
}
