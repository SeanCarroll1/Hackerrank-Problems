import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StockMaximize {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
              int t = in.nextInt();
              while(t>0)
              {
                     int length = in.nextInt();
                     long sum = 0;
                     int[] list = new int[length];

                     for (int j = 0; j < length; j++) {
                           list[j] = in.nextInt();
                     }
                    
                     int max = list[length-1];;
                    
                     for (int j = length-1; j>=0; j--) {
                           if (max < list[j]) {
                               
                                  max = list[j];
                              
                           }
                           
                           sum += (max - list[j]);
                      
                     }
                     System.out.println(sum);
                  t--;
                    
    }
    }
}