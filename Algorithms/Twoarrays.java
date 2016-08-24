import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Twoarrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
            {
                
            int length=in.nextInt();
            
            int n=in.nextInt();
          int [] a =new int[length];
                int [] b=new int[length];
            
            for(int i=0; i<length; i++){
                a[i]=in.nextInt();
            }
             for(int i=0; i<length; i++){
                b[i]=in.nextInt();
            }
            
            Arrays.sort(a);
            Arrays.sort(b);
            String ans="YES";
            
            for(int i=0; i<a.length; i++)
            {
                long sum=a[i]+b[length-i-1];
                if(sum<(long)n)
                    {
                    ans="NO";
                    break;
                }
            }
            
            
                System.out.println(ans);
            
                t--;
        }
    }
}