import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in= new Scanner(System.in);
        
        int start=in.nextInt();
        int end=in.nextInt();
        int div = in.nextInt();
        int result=0;
        
        while(start<=end)
        {
        	//check if whole number , if so increment result
              if((start-reverse(start)) % div ==0)
              {
                  result++;
              }
            start++;
        }
        
        System.out.println(result);
    }
    
    //method to reverse int
    public static int reverse (int x)
    {
        int rev = 0;
        while(x != 0){
            rev = rev*10 + x%10;
            x = x/10;
        }

        return rev;
    }
    
}