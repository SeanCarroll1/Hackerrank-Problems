import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Candies {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        int sum=0;
        int[]up=new int[t];
        int[]down=new int[t];
        int[] list= new int[t];
        
       for(int i=0; i<t; i++){
            
            list[i]=in.nextInt();
            
        }
        up[t-1]++;
        for(int i=t-2; i>=0; i--)
            {
            if(list[i]>list[i+1])
                {
                    up[i]=1+up[i+1];
            }
            else{
                up[i]++;
            }
        }
        down[0]++;
         for(int i=1; i<t; i++)
            {
             if(list[i]>list[i-1])
                {
                    down[i]=1+down[i-1];
            }
            else{
                down[i]++;
            }
        }
        
        for(int i=0; i<list.length; i++)
            {
                sum+=Math.max(up[i],down[i]);
          
        }
        System.out.println(sum);
    }
}