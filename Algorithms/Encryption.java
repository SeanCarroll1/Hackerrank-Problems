import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        String name=in.nextLine();
        int size=name.length();
        double row=Math.floor(Math.sqrt(name.length())),col=Math.ceil(Math.sqrt(name.length())),small=size;
         
         name=name.replaceAll("\\s","");
       
     
       
       String n1="";
    
        for(int i=0; i<col; i++)
            {
               for(int j=i; j<name.length(); j+=col)
                    {
                      n1+=name.charAt(j);
                }
            System.out.print(n1 + " ");
            n1="";
        }
    }
}