import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6LetsReview {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t-- >0)
         {
             String word=in.next();  
             String even="";
            String odd="";
            for(int i=0; i<word.length(); i++)
            {
                if(i%2==0)
                 {
                    even+=word.charAt(i);
                }else
                    {
                    odd+=word.charAt(i);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}