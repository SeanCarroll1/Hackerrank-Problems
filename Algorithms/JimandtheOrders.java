import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JimandtheOrders {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in= new Scanner(System.in);
        int len=in.nextInt();
        int time[]=new int[len];
        int length[]=new int[len];
           for(int i=0; i<len; i++)
        {
               
            time[i]=in.nextInt()+in.nextInt();
            
        }
        
        for(int i=0; i<len; i++)
        {
            int small=Integer.MAX_VALUE,pos=0;
           for(int j=0; j<len; j++)
           {
                    if(small>time[j])
                        {
                        small=time[j];
                        pos=j;
                    }

           }
            time[pos]=Integer.MAX_VALUE;
            System.out.print(pos+1 + " ");
            
        }
    }
}