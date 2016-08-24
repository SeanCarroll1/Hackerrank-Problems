import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        boolean test=false;
        while(t>0)
        {
            int length=in.nextInt();
            int sumLeft=0,sumRight=0;
            int[] list=new int[length];
            int k=0;
            while(k<length)
                {
                    list[k]=in.nextInt();
                k++;
                
                }
            sumLeft=0;
            sumRight=0;
                for(int i=1; i<length; i++)
                {
                  
                    if(i>0)
                        {
                        sumLeft+=list[i-1];
                    }
                   if(i==1)
                       {
                        for(int j=i+1; j<length; j++)
                       {
                       
                     
                           sumRight+=list[j];
                          
                       }
                       
                   }
                  
                      if(sumLeft>sumRight)
                        {
                        break;
                    }
                   
                  
                    
                    if(sumLeft==sumRight)
                        {
                          System.out.println("YES");
                        test=true;
                        break;
                    }
                    
                    sumRight-=list[i+1];
            }
            if(length==1)
                {
                 System.out.println("YES");
            }
               else if(test==false)
                    {
                     System.out.println( "NO"  );
                }
            
            test=false;
            t--;
        }
    }
}