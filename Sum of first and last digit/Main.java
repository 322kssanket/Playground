import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in = new Scanner( System.in);
        int n=in.nextInt();
        int last_digit=n%10;
        int sum=0;
        int first=0;
        while(n>0)
        {
          n=n/10;
          if(n!=0)
            first=n;
          
        }
        sum=last_digit+first;
        System.out.println(sum);
          
	}
}