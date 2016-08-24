import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaAndStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a=0,b=0,n=0;
        while(t>0)
            {
                n=in.nextInt();
                a=in.nextInt();
                b=in.nextInt();
                int min = Math.min(a, b);
                int max = Math.max(a, b);
               
                if(min==max)
                    {           
                         System.out.print(min*(n-1));                      
                     }
                
                    else{
                 int difference = max - min;
                
                int l = (n - 1) * min;
                int u = (n - 1) * max;
               

                for (int j = l; j <= u; j += difference)
                {
                    System.out.print(j+ " ");

                  
                }
                    }
                System.out.println("");
            
                t--;
            }
    }
}