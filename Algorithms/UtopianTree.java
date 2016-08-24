import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int i=0;
        while(i<t)
            {
                  int p = in.nextInt();
                    int j=0,k=0;
                    
                    while(j<=p)
                        {
                            if(j%2==0)
                                {
                                k=k+1;
                            }
                        else
                            {
                            k=k*2; 
                        }
                           j++;
                    }
            i++;
            System.out.println(k);
        }
    }
}