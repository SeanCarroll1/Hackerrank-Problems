import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClosestNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
           Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        long[]list=new long[t];
        int i=0;
        while(i<t)
            {
                list[i]=in.nextInt();
            i++;
        }
        Arrays.sort(list);
        
       
                    long min =list[1]-list[0];
         
                    for(int j=0; j<list.length-1; j++)
                    {
                       
                        if((list[j+1]-list[j])<min)
                            {
                                   
                                min=list[j+1]-list[j];
                        }
                    }
                  for(int j=0; j<list.length-1; j++)
                    {
                        if((list[j+1]-list[j])==min)
                            {
                                System.out.print(list[j]+" " +list[j+1] + " ");
                        } 
                      
                  }
       
           
        }
    }
    
