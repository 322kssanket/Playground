import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner in = new Scanner(System.in);
       int row=in.nextInt();
       int column=in.nextInt();
       int arr[]=new int[column];
       int count=column;
       for(int l=0;l<=column-1;l++)
       {
         arr[l]=column;
       }
       for(int i=0;i<=row-1;i++)
       {
         for(int j=i;j<=column-1;j++)
         {
           arr[j]=count-i;
         }
         for(int k=0;k<=column-1;k++)
         {
            System.out.print(arr[k]);
         }
         System.out.println("");
       }
    }
         
}



