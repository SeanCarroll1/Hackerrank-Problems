import java.io.*;
import java.util.*;

public class Day10BinaryNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        
        int i=in.nextInt(),count=0,tempcount=0;
       String word= Integer.toBinaryString(i);
      
        for(int j=0; j<word.length(); j++)
        {
            if(word.charAt(j)=='1')
             {
               
             tempcount++;   
                 if(tempcount>count)
                    {
                    count=tempcount;
                }
            }else
                {
               
                tempcount=0;
            }
        }
        System.out.println(count);
    }
}