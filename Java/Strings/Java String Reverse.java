import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
       System.out.println(palindrome(A) ? "Yes" : "No");
    }
    
    
    public static boolean palindrome (String a)
    {
        int k=a.length()-1;
         for(int i=0; i<a.length(); i++)
        {
                if(a.charAt(i)!=(a.charAt(k)))
                {
                    return false;
                }
             k--;
        }
        
        return true;
    }
}
