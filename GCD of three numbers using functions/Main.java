import java.util.Scanner;
class Main{
    public static int gcd_(int n1, int n2)
	{
       int min,gcd=0;
       if(n1<n2)
         min=n1;
       else
         min=n2;
      while(min>=1)
      {
         if(n1%min==0 && n2%min==0)
         {
            gcd=min;
            break;
         }
         min--;
      }
      return gcd;
    }
       
	public static void main (String[] args)
	{
	    Scanner in =new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int gcd= gcd_(n1,n2);
        int gcd1=gcd_(gcd,n3);
        System.out.println(gcd1);
	}
}