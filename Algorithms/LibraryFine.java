import java.io.*;
import java.util.*;

public class LibraryFine {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in = new Scanner(System.in);
        int dayR=in.nextInt();
        int monthR=in.nextInt();
        int yearR=in.nextInt();
        
          int dayE=in.nextInt();
          int monthE=in.nextInt();
          int yearE=in.nextInt();
        
        if(yearR>yearE)
            {
                System.out.println(10000 * (yearR-yearE));
        }else if(yearR==yearE)
            {
                if(monthR>monthE)
                    {
                                    System.out.println(500*(monthR-monthE));

                }else if(monthR==monthE && dayR>dayE)
                    {
                        
                                                        System.out.println(15*(dayR-dayE));

                }else
                    {
                     System.out.println("0");
                }
        }else
            {
             System.out.println("0");
        }
    }
}