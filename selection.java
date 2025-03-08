import java.util.*;
class selection
{
    public static void main(String args[])
    {
        int a[]={2,1,5,8,5,4,9};
        int i,j,temp=0;
       int n=a.length;
        for(i=0;i<n-1;i++)
        {
            int minIndex=i;
         for(j=i+1;j<n;j++)
         {
            if(a[j]<a[minIndex])
            {
            minIndex=j;
            }
         } 
         temp=a[minIndex];
         a[minIndex]=a[i];
         a[i]=temp;  
        }

        for(i=0;i<n;i++)
        {System.out.print(a[i]+" ");}

    }
}
