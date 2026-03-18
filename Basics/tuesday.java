//count subarray of size k with sum >x
package Basics;

import java.util.Scanner;

public class tuesday {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,10,4,2,20};

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the k :");
        int k = sc.nextInt();
         System.out.println("Enter the X:");
        int x = sc.nextInt();

        int sum=0;
        for(int i=0; i<k;i++){
            sum+=arr[i];
        }

        int max=sum;
        int count=0;
        for(int i=k;i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum>max){
                max=sum;
            }
            
            if(sum>x){
                count++;
            }
        }
        System.out.println(max +" and  "+ count );


    }
    
    
}
