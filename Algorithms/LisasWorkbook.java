import java.io.*;
import java.util.*;

public class LisasWorkbook {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int k = in.nextInt();
         int pages = 1,total=0;
        
        while(n-->0)
        {
            int i=in.nextInt();
            int check=1;
        
            while(check<=i)
            {

                if(pages==check)
                    {
                    total++;
                    }
                
                if(check % k == 0)
                    {
                    pages++;
                }
                
                 check++;
            }
           
                if(i%k!=0)
                    {
                                 pages++;

                }
           
                
            
         
            }
           System.out.println(total);
        }
     
    }