import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        char ch=in.next().charAt(0);
        int k=in.nextInt();
        if(ch>='a' && ch<='z')
        {
          
          k=k%26;	
          if(ch-k<'a')
          {
            ch=(char)('z'+1-('a'-(ch-k)));
          }
          else
          {
            ch=(char)(ch-k);
          }
          System.out.println(ch);
        }
        if(ch>='A' && ch<='Z')
        {
          
          k=k%26;
          ch=(char)(ch-k);
          System.out.println(ch);
        }
    }
}