import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int first=num1/100;
        int third=num1%10;
        int sum=first+third;
        System.out.println(sum);
	}
}