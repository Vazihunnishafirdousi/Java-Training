package Basics;
//write a program which rotate the array by three elements in anticlock wise 
public class tuesday3 {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,2,8};
        int k= 2;
        for(int j=0;j<k;j++){
             int starting=arr[0];
            for(int  i=0; i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]= starting;
        }
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]+",");
        }

    }
    
}
