import java.io.*;
import java.util.*;

public class Day9Recursion {
public static int k=1;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in=new Scanner(System.in);
        
        int result = factorial (in.nextInt());
        System.out.println(result);
    }
    
    
    private static int factorial (int n){
  
        
    if(n > 1){ // recursive case
        k=k*n;
      
        return factorial(n - 1); //+ nTimesK(n - 1, k);
    }
    else{ // base case n = 1
        return k;
    }
}
}