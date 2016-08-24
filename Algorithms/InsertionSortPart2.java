import java.io.*;
import java.util.*;

public class InsertionSortPart2 {

    public static void insertionSortPart2(int[] ar)
    {       
           // Fill up the code for the required logic here
           // Manipulate the array as required
         
        for(int i=1; i<ar.length; i++)
            {
               
                for(int j=0; j<i; j++)
                    {
                        if(ar[j]>ar[i])
                        {
                        int temp =ar[i];
                        ar[i]=ar[j];
                        ar[j]=temp;
                        
                         }
                }
            printArray(ar);
        }
    }  
    
    
      
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int s = in.nextInt();
       int[] ar = new int[s];
       for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
       }
       insertionSortPart2(ar);    
                    
    }    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
