import java.util.Scanner;
class Main{
  public static int sum1(int n){
        int sum=0;
        for (int i=0;i<=n;i++)
        {
           sum =sum+i;
	    }
        return(sum);
  }
	public static void main (String[] args){
	    Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        int sum = sum1(n);
        System.out.println(sum);
}
}