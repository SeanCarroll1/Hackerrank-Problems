import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximizingXOR {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
   int a=l,b=l,count=1;
        while(a<=r)
            {
            
                     while(b<=r)
                      {
                          if((a^b)>count)
                         {
                             count=(a^b);
  
                         }
                          b++;
                        }
           
            a++;
            b=a;
        }
        
        return count;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
