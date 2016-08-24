import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		
		  /* Declare second integer, double, and String variables. */
        int sec=scan.nextInt();
        /* Read and save an integer, double, and String to your variables.*/
        double num=scan.nextDouble();
        String word="";
		while(scan.hasNext())
			{
				word+=scan.next()+" ";
		}
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+sec);
        System.out.println(d+num);
        /* Print the sum of the double variables on a new line. */
		System.out.println(s+word);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        scan.close();
    }
}