import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        
        int min=Integer.MAX_VALUE;
        
        for(int i=0; i<A.length; i++)
        {
            for(int j=i+1; j<A.length; j++)
             {
                 if(A[i]==A[j])
                 {
                      if(Math.abs(j-i)<min)
                      {
                          min=Math.abs(j-i);
                      }
                 }
                
            }
            
        }
        if(min==Integer.MAX_VALUE)
        {
            min=-1;    
            
        }
        System.out.println(min);
    }
}
