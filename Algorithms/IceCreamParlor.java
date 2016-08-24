import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IceCreamParlor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int i=0;
     
        while(t>0)
            {
               int money=in.nextInt();
                int flavours=in.nextInt();
                int[] list=new int[flavours];
            while(i<flavours)
                {
               
                    list[i]=in.nextInt();
                i++;
            }
            
            for(int j=0; j<list.length; j++)
                {
                    for(int k=j+1; k<list.length; k++)
                        {
                                
                                 if(list[j]+list[k]==money)
                        {
                               System.out.print((j+1)+" " +(k+1));
                            }
                    }
                     
            }
            System.out.println("");
            t--;
            i=0;
        }
        
        
    }
}