import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheMaximumSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int t=in.nextInt();
        
        while(t>0)
        {
           
            int length=in.nextInt();
             int [] list=new int[length];
            for(int i=0; i<length; i++)
                {
                    list[i]=in.nextInt();
            }
            int sum=0,conSum=0,result=0;
           
                for(int i=0; i<list.length; i++)
                {
                if(list[i]>0)
                    {
                        
                            
                        conSum+=list[i];
                }
               
                       
                        sum+=list[i];
                   
                      if(list[i]>sum)
                        {
                            sum=list[i];
                        
                    }
                        if(sum>result)
                            {
                            result=sum;
                        }
                  
                
               
                    
            }
            
            if(conSum==0){
                result=list[0];
                conSum=list[0];
            }
            System.out.println(result +" "+ conSum);
            t--;
        }
    }
}