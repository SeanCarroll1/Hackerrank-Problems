import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Cutthesticks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
       Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    int list[] = new int[t];

    for(int i = 0 ;i < t ; i++){
        list[i] = in.nextInt();
    }

    Arrays.sort(list);

    int cuts = 0;

    while(cuts<list.length){
        System.out.println(list.length-cuts);
        int min = list[cuts++];
        while( cuts <list.length && list[cuts]==min) 
        {
            cuts++;
         }
    }

}
    }