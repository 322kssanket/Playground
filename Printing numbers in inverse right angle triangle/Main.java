import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int n1=2*n;
        int num=n;
        for(int i=1;i<=n;i++)
        {
          int r=n-i+1;
          for(int k=1;k<=n-i+1;k++)
          {
            System.out.print(r);
            r--;
          }
          for(int j=1;j<=i;j++)
          {
            System.out.print(" ");
          }
          System.out.println();
          
	   }
	}
}