import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        int size = in.nextInt(); 
        int arr[]=new int[size];
        for(int i=0;i<=size-1;i++)
        {
          arr[i]=in.nextInt();
        }
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int found1=0,found2=0;
        int element_1_index=-1,element_2_index=-1;
        for(int j=0;j<size;j++)
        {
          if(n1==arr[j])
            element_1_index = j;
            
          if(n2==arr[j])
            element_2_index = j;
            
        }
        
          System.out.println(element_1_index);
        
        
          System.out.println(element_2_index);
        
       
    }
}