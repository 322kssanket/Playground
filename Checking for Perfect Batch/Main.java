import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<=n-1;i++)
    {
      arr[i]=in.nextInt();
    }
    int last_sum=arr[0]+arr[1]+arr[2];
    int flag=0,sum=0;
    for(int j=3;j<=n-1;j++)
    {
      
      if(j%3==0)
      {
         sum=0;
      }
      sum+=arr[j];
      if(j%3==2)
      {
        if(last_sum==sum)
        {
          flag=1;
        }
      }
    }
    if(flag==1)
    {
      System.out.println("Perfect Batch");
    }
    else
    {
      System.out.println("Not a Perfect Batch");
    }
  }   
}
  