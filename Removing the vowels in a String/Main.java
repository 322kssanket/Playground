import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in =new Scanner(System.in);
    String str=in.nextLine();
    StringBuilder sb=new StringBuilder(str);
    StringBuilder result=new StringBuilder("");
    int str_len=sb.length();
    for(int i=0;i<str_len;i++)
    {
      char ch=str.charAt(i);
      if(ch!='a' && ch!='e'&& ch!='i' && ch!='o' && ch!='u')
      {
         result.append(str.charAt(i));
      }
    }
    System.out.println(result);
  }
}
