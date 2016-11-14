import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in= new Scanner(System.in);
        
        String word=in.next();
        int sub=in.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<=word.length()-sub; i++)
        {
                list.add(word.substring(i,i+sub));
        }
        
        Collections.sort(list);
        
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

    }
}