import java.util.Scanner;
class Main{
    public static int power (int b,int e){
        int power=1;
        for(int i=1;i<=e;i++)
        {
           power = power * b;
        }
        return(power);
    }
          
	public static void main (String[] args){
	    Scanner in = new Scanner (System.in);
        int b=in.nextInt();
        int e=in.nextInt();
        int pow =power(b,e);
        System.out.println(pow);
	}
}