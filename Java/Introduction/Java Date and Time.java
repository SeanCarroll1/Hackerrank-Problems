import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.time.*;
import java.time.LocalDate;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int mm = in.nextInt();
        int dd = in.nextInt();
        int yy = in.nextInt();
        in.close();
        LocalDate dt = LocalDate.of(yy, mm, dd);
        System.out.print(dt.getDayOfWeek());
    }
}
