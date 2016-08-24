import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int store=0,count=0;
        while(t>0)
        {
            int number=in.nextInt();
            int num=number;
            count=0;
                while(num>0)
                    {
                      
                  if(num % 10==0)
                      {
                      
                  }
                        else if( number%(num % 10)==0)
                         {
                          count++;
                          }
                 
                         num = num / 10;
                    }  
             
             System.out.println(count);
            
            t--;    
        }
      
    }
}