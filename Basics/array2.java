package Basics;

public class array2 {
    public static void main(String[] args) {
        
    
    int arr[] = { 1,2,3,4,5,5,0};
        int target = 3;

        for(int i=0; i<arr.length-1;i++){
            for(int j=1; j<arr.length; j++)
            
            
            if(target==(arr[i]+arr[j])){
                System.out.println(i +" "+j);
                break;
            }

        }
    
}
}
