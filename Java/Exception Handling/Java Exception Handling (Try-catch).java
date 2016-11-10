import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in=new Scanner(System.in); 
        try{
            int x=in.nextInt();
            int y=in.nextInt();

            System.out.println(x/y);

    }
    catch(ArithmeticException e){
        System.out.println("java.lang.ArithmeticException: / by zero");

    }
    catch (InputMismatchException e){
        System.out.println("java.util.InputMismatchException");
    }
    }
}