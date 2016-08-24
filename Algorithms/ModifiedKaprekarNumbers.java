import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        
            int total=0;
            long a=in.nextLong();
            long b=in.nextLong();
            
            for(long i=a; i<=b; i++)
             {
                long num=i*i,sum=0,div=10,length=0;
                length = String.valueOf(num).length()/2;

                                if( String.valueOf(num).length()%2!=0)
                                    {
                                    length++;

                                }
                
                while(length>1)
                {
                    div=div*10;
                    length--;
                }
                //System.out.println(div + " "  + num  );
                while(num>0&&sum<=i)
                    {
                    sum+=num%div;
                    num=num/div;
                }
                
                
                if(sum==i)
                {
                       total++;
                    System.out.print(i+" ");
                }

            }
        if(total==0)
            {
            System.out.println("INVALID RANGE");
        }
        
    }
}