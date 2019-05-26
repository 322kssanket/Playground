import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner( System.in);
        int n=in.nextInt();
        int sum=0;
        int first=0;
        
        while(n/100>0)
        {
          n=n/10;
        }
        
        System.out.println(n%10);
          
	}
}