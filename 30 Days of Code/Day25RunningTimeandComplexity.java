import java.io.*;
import java.util.*;

public class Day25RunningTimeandComplexity {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        
         int n = in.nextInt();
        
        while(n-->0)
        {
               if (isPrime(in.nextInt()))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
      
    }
    
    private static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < Math.sqrt(num); i++)
            if (num % i == 0) return false;
        return true;
    }
}