import java.util.Scanner;
public class Main
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
    int j=0,count=0,max_count=0;
    for(j=0;j<n;j++)
    {
      while(j<n  && arr[j]==1 )
      {
        count++;
        j++;
        //if(j==n)
        //
          //break;
      }
        
      
      //System.out.println(count);
    
      if(count>max_count)
      {
        max_count=count;
      }
      count=0;
    }
    System.out.println(max_count);
    
    }
}
