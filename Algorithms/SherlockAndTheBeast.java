import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i=0;i<T;i++){
            
            int N = in.nextInt();
            int num3=N/3;
            int num5=N-num3*3;
            
            while(num3>0&&num5>0&&num5%5!=0)
             {
                    num3--;
                    num5=N-num3*3;
            }
            
            if(num5%5==0)
                {
                while(num3>0)
                    {
                    System.out.print("555");
                    num3--;
                }
                
                while(num5>0)
                    {
                        System.out.print("33333");
                    num5-=5;
                }
            }else
                {
                System.out.print("-1");
            }
            
            
            
            System.out.println();
            
        }
    }
}