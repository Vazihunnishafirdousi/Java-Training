package ZDSA;

public class program53 {
     public static void main(String[] args) {
       int [] arr={-2,1,-3,4,-1,2,1,-5,4};
       int k=4;
       int sum=0;
       for(int i=0;i<k;i++){
           sum+=arr[i];
       }
       int max=sum;
       for (int i =k; i<arr.length;i++){
           sum+=arr[i];
           sum-=arr[i-k];
           if (sum>max) max=sum;
       }
       System.out.println("maximum sum is "+max);

   }
    
}
