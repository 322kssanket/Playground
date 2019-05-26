import java.util.Scanner;
class Main{
  public static void main(String args[]) {
   Scanner scan =new Scanner(System.in);
        String str=scan.nextLine();
        int len=str.length();
        String str1=scan.nextLine();
        int len1=str1.length();
        int flag=1,count=0;
        for(int i=0;i<len-len1+1;i++)
        {
          flag=1;
          for(int j=0;j<len1;j++)
          {
             if(str.charAt(j+i)!=str.charAt(j))
             {
                flag=0;
                break;
             }
             
          }
          if(flag==1)
          {
            count++;
          }
        }
        
          System.out.println(count);
        
        
  } 
}

