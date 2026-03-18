package Basics;

public class tuesday2 {
    public static void main(String[] args) {
        int arr[]={-5,1,5,0,7};
        int arr2[]=new int[6];
        int cur_sum=0;
        arr2[5]+=cur_sum;
        for(int i=0; i<arr.length;i++){
            cur_sum+=arr[i];
        }
        System.out.println(arr2);
    }
    
}
