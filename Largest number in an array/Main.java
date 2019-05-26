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
        int largest=arr[0];
        for(int j=1;j<size;j++)
        {
          if(largest<arr[j])
            largest=arr[j];   
        }
        
          System.out.println(largest);

    }
}