import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in =new Scanner(System.in);
       int n=in.nextInt();
       int arr[]=new int[n];
       int i=0;
       int k=in.nextInt();
       for( i=0;i<n;i++)
       {
         arr[i]=in.nextInt();
       }
       
       int max_indx=n-1;
       for(int j=0;j<n-1;j++)
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
       
       int count=1;
       for(i=1;i<n;i++)
       {
         if(arr[i]==arr[i-1])
         {
           count++;
         }
         else
         {
           
             System.out.println(arr[i-1]+" "+count);
             count=1;
           if(arr[i]==arr[n-1])
           {
             System.out.println(arr[i]+" "+count);
           }
              
         }
        }
        
        int l=arr[n-1];
        for( l=l+1;l<=k;l++)
        {
          System.out.println(l+" "+0);
        }
    
    }
}