import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindtheMedian {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i=0;
        int [] list=new int[n];
        int sum=0;
        while(i<n)
            {
                
            list[i]=in.nextInt();
            i++;
        }
        Arrays.sort(list);
        System.out.println(list[list.length/2]);
    }
}