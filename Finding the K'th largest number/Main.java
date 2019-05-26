import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in =new Scanner(System.in);
       int n=in.nextInt();
       int arr[]=new int[n];
       int i=0;
       for( i=0;i<n;i++)
       {
         arr[i]=in.nextInt();
       }
       int k=in.nextInt();
       int max_indx=n-1;
       for(int j=0;j<k;j++)
       {
         max_indx=n-1-j;
         for(i=n-1-j;i>=0;i--)
         {
           if(arr[max_indx]<arr[i])
           {
             int temp=arr[max_indx];
             arr[max_indx]=arr[i];
             arr[i]=temp;
           }
         }
       }
       System.out.println(arr[max_indx]);
    
    }   
}