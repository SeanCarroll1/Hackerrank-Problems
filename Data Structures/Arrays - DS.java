import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int [] array= new int[n];
        while(n-- >0)
        {
            array[n]=in.nextInt();
        }
        
        for(int i: array)
       {
            System.out.print(i + " ");
        }
    }
}