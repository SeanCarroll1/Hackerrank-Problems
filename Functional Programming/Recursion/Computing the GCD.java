import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int start= in.nextInt();
        int end= in.nextInt();
        
        System.out.println(gdc(start,end));
    }
    
    public static int gdc (int s, int e)
    {
        if (e==0) 
            return s;
        else
            return gdc(e, s % e);
    }
    
    
}