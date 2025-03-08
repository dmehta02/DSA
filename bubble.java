import java.util.Scanner;

public class bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]={4,6,3,2,5,5,45,22,78,33};
        int i,j,temp;
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-1-i;j++)
            {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
        }
        for(i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}
