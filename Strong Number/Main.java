import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0,digit;
        int temp=n;
        while(n>0)
        {
        digit=n%10;
        int fact=1;
        for(int i=1;i<=digit;i++)
        {
          fact*=i;
        }
        sum+=fact;
        n/=10;
        }
        if (temp==sum)
           System.out.println("Yes");
        else
          System.out.println("No");
        
          
	}
}