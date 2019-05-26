import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int  originalNumber, remainder, result = 0, n1 = 0;

        originalNumber = n;

        for (;originalNumber != 0; originalNumber /= 10, ++n1);

        originalNumber = n;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n1);
        }

        if(result == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not a Armstrong Number");
	}
}