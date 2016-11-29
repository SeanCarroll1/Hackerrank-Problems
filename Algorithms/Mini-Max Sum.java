import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
            
            
            long max = Long.MIN_VALUE;
            long min = Long.MAX_VALUE;
            long sum = 0;
            
            for (int i = 0; i < 5; i++)
            {
                long n = in.nextLong();
                
                max = Math.max(max, n);
                min = Math.min(min, n);
                sum += n;
            }
        
        System.out.println((sum - max) + " " + (sum - min));
    }
    
   
}
