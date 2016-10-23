import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System. in);
        
        int n= in.nextInt();
        int people=5,seen=0;
        
		//loop while we still have days
        while(n-- > 0)
        {
            people /=2;
            seen+=people;
            people=people*3;  
        }
        //Print out the amount of people that have seen the advertising.
        System.out.println(seen);
    }
}