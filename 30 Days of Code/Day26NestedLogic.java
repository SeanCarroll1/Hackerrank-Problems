import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day26NestedLogic {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int d=in.nextInt();
        int m=in.nextInt();
        int y=in.nextInt();
        
          int d2=in.nextInt();
          int m2=in.nextInt();
          int y2=in.nextInt();
        
        if(d>d2&&m==m2&&y==y2)
            {
                System.out.println(Math.abs(d-d2)*15);
        }else if(m>m2&&y==y2)
            {
                            System.out.println(Math.abs(m-m2)*500);
        }else if(y>y2)
            {
             System.out.println(10000);
        }else
            {
              System.out.println(0);
        }
        
    }
}