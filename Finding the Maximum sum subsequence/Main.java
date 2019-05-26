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
    int j=0,sum=0,max_sum=0;
    for(j=0;j<n-1;j++)
    {
      if(arr[j]<=arr[j+1])
      {
        sum+=arr[j];
      }
      else
      {
        sum+=arr[j];
        if(sum>max_sum)
        {
          max_sum=sum;
        }
        sum=0;
      }
    }
    if(arr[n-2]<=arr[n-1])
    {
      sum+=arr[n-1];
      if(max_sum<sum)
      {
        max_sum=sum;
      }
    }
    else
    {
      sum=arr[n-1];
      if(max_sum<sum)
      {
        max_sum=sum;
      }
    }
    System.out.println(max_sum);
    
    
    
        
  }
}