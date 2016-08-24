import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACMICPCTeam {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int topics=in.nextInt();
        String [] list =new String[t];
        int i=0;
        while(i<t)   
            {
                list[i]=in.next();
                i++;
        }
        int most=0,count=0,num=0;
        for(int j=0; j<t; j++)
            {
                     String word=list[j];
                   
                   
                for(int k=j+1; k<t; k++)
                    {
                        String word2=list[k];
                        for(int p=0; p<topics; p++)
                            {
                                if(word.charAt(p)=='1'||word2.charAt(p)=='1')
                                    {
                                        count++;
                                }
                        }
                        if(most<count)
                            {
                            most=count;
                            num=0;
                        }
                        if(most==count)
                            {
                            num++;
                        }
                        count=0;
                    
                }
                
        }
        System.out.println(most);
        System.out.println(num);
    }
}