import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingSort2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        int[] list=new int[t];
        
        for(int i=0; i<t; i++)
            
            {
                        list[i]=in.nextInt();
        }
        
        int num=0;
       int count=0;
          while(t>0)
            {
                count=0;
                for(int j=0; j<list.length; j++)
                    {
                        if(list[j]==num)
                            {
                                 System.out.print(num+ " ");
                                count++;
                        }
                   
                }
              
            num++;
            t-=count;
        }
      
        
    }
}