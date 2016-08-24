import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingSort3 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner (System.in);
        int t=in.nextInt();
        int [] list= new int[100];
        int i=0;
        while(i<t)
        {
            list[in.nextInt()]++;
            String word=in.next();
            
            i++;
        }
      
        
       int sum=0;
      
        for(int j=0; j<100; j++)
            {
               sum+=list[j];
                
            
               System.out.print(sum + " ");
        }
     
    }
}