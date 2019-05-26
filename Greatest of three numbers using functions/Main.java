import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in =new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int max;
        if(n1>n2)
          max=n1;
        else
          max=n2;
        if(n3>max)
          max=n3;
        System.out.println(max);
      
          
        
        
	}
}