import java.io.*;
import java.util.*;

public class Solution {

    static boolean isAnagram(String a, String b) 
    {
        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();
        
        Arrays.sort(ac);
        Arrays.sort(bc);
        
        return Arrays.equals(ac,bc);
        // Complete the function by writing your code here.
        
    }

     public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}