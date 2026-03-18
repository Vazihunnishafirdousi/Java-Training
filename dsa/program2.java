package ZDSA;

public class program2 {
    public static void main(String[] args) {
        int arr[]={2,1,0,1,2,0,0,1,1};
        int l=0,m=0,h=arr.length-1;
        while(m<=h){
            if(arr[m]==0){
                arr[m]=arr[l];
                arr[l]=0;
                m++;
                l++;
            }
            else if(arr[m]==2){
                arr[m]=arr[h];
                arr[h]=2;
                h--;
            }
            else{
                m++;
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ ",");
        }

    }
    
}
