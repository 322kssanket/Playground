import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
      }
      int k=0;
      int j=n-1,flag=1;
      while(k<j)
      {
        if(arr[k]!=arr[j])
        {
          flag=0;
          break;
        }
        else
        {
          k++;
          j--;
        }
      }
      if(flag==1)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
      
        
        
    }
}