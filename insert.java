public class insert {
    public static void main(String args[])
    {
    int a[]={2,3,6,8,5,5};
    int temp,j;
    int n=a.length;
    for(int i=1;i<n;i++)
    {
     int key= a[i];
     j=i-1;
     while(j>=0 && a[j]>key)
     {
        a[j+1]=a[j];
        j--;
     }
     a[j+1]=key;  
    }
    for(int i=0;i<n;i++)
    {
    System.out.println(a[i]+" ");
    }
}
}