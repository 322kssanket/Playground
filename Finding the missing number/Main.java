import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<=n-1;i++)
        {
           arr[i]=in.nextInt();
        }
        int arr1[]=new int[n];
        for(int l=0;l<=n-1;l++)
        {
           arr1[l]=0;
        }
        for(int k=0;k<=n-1;k++)
        {
           arr1[arr[k]-1]=1;
        }
        for(int j=0;j<=n-1;j++)
        {
           if(arr1[j]!=1)
           {
             System.out.println(j+1);
           }
        }
        
    }
}