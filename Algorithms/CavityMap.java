import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        String [] list=new String[t];
        int ij=0;
          while(ij<t)
            {
            String text=in.next();
            list[ij]=text;
              ij++;
          }
      
           
        
            for(int i=0; i<list.length; i++)
                {
                    int j=1;
                    while(j<list[i].length()-1)
                        {
                        if(i==0||i==list.length-1)
                            {
                            break;
                        }
                            if(list[i].charAt(j)>list[i].charAt(j+1) && list[i].charAt(j)>list[i].charAt(j-1) && list[i].charAt(j)>list[i-1].charAt(j) &&list[i].charAt(j)>list[i+1].charAt(j) )  
                                {
                                 list[i] = list[i].substring(0,j)+'X'+list[i].substring(j+1);
                            }
                        j++;
                    }
                    System.out.println(list[i]);
            }
            
        
        
    }
}