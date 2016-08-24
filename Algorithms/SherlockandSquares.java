import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockandSquares {



    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();



            int count = (int) Math.sqrt(b) - (int) Math.sqrt(a);
            if (Math.sqrt(a) % 1 == 0)// || Math.sqrt(a) % 1 == 0)
                count++;
          System.out.println(count);

           
        }

     
    }


}