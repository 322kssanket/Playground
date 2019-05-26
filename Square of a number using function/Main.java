import java.util.Scanner;
class Main
{   
    public static int square(int n)
    {
      int sqr=n*n;
      return sqr;
    }
	public static void main (String[] args)
    {
	   Scanner in = new Scanner(System.in);
       int n =in.nextInt(); 
       int sqr = square(n);
       System.out.println(sqr);
	} 
}