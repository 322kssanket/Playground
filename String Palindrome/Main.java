import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner scan =new Scanner(System.in);
        String str=scan.nextLine();
        int len=str.length();
        int flag=1,i=0,j=len-1;
        while(i<j)
        {
          if(str.charAt(j)!=str.charAt(i))
          {
            flag=0;
          }
          i++;
          j--;
        }
        if(flag==1)
        {
          System.out.println("Yes");
        }
        else
        {
          System.out.println("No");
        }
    } 
}


