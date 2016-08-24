import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PriyankaAndToys {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int length=in.nextInt();
        int index=0;
        int[] list=new int[length];
        while(index<length)
            {
            list[index]=in.nextInt();
            index++;
        }
        Arrays.sort(list);
      
        int sum=0,co=-1;
        for(int i=0; i<length; i++)
            {
                if(list[i]>co)
                    {
                    co=list[i]+4;
                    sum++;
                }
          
            
            
        }
        System.out.println(sum);
    }
}