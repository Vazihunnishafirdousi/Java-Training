package Basics;

public class arraymax {
    public static void main(String[] args) {
        // maximum numberin array
        int arr[]={1,2,3,4,5,6,0};
        int max = arr[0];
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        
        }
        System.out.println(max); 

       
        }



        
    }
    

