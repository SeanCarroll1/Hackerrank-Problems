import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        
        int amount=in.nextInt();
        int flag=0;
        
        while(amount>0)
         {  
            flag=0;
            String word=in.next();
            String word2=in.next();
                char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            for(int i=0; i<alphabet.length; i++)
                {
                
                   if(word.indexOf(alphabet[i])>-1 && word2.indexOf(alphabet[i])>-1)
                   {
                       flag=1;
                       break;
                   }
                  
            }
            
            if(flag>0)
                {
                    System.out.println("YES");
                
            }else
                {
                    System.out.println("NO");
            }
            amount--;
        }
    }
}