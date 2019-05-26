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
    int max_ind=0;
    int max=arr[0];
    for(int j=1;j<=n-1;j++)
    {
      if(max<arr[j])
      {
        max=arr[j];
        max_ind=j;
      }
    }
    System.out.println(max_ind);
  }
}