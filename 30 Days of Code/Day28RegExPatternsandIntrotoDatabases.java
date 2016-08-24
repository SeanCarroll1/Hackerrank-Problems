import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day28RegExPatternsandIntrotoDatabases {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> list = new ArrayList();
        
        String email = ".+@gmail\\.com$";
        Pattern pattern = Pattern.compile(email);
        
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
             Matcher matcher = pattern.matcher(emailID);
            if (matcher.find()){
                list.add(firstName);
            }
        }
     
        Collections.sort(list);
        for (String name : list){
            System.out.println(name);
        }
    
    }
}
