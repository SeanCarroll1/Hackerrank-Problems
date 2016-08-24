import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MissingNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[]one =new int[n];
        int i=0;
        while(i<n)
            {
            one[i]=in.nextInt();
            i++;
        }
        i=0;
        Arrays.sort(one);
        int  m=in.nextInt();
          int[]two =new int[m];
         while(i<m)
            {
            two[i]=in.nextInt();
            i++;
        }
        i=0;
        Arrays.sort(two);
        int j=0;
        int count=0,count2=0,store=0;
        while(i<m)
            {
            j=0;
            
                while(j<m)
                    {
                        if(two[i]==two[j])
                            {
                                count++;
                        }
                   
                    j++;
                }
              j=0;
            while(j<n)
                {
                    if(two[i]==one[j])
                        {
                        count2++;
                    }
                j++;
            }
            if(count>count2&&store!=two[i])
                {
                
                
                System.out.print(two[i]+ " ");
                store=two[i];
            }
           
            count2=0;
            i+= count; 
             count=0;
        }
    }
}