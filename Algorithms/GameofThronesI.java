import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameofThronesI {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString2 = myScan.nextLine();
        char[] chars = inputString2.toCharArray();
        Arrays.sort(chars);
        String inputString = new String(chars);
        String ans="";
        int count=0,num=0,check=0;
       for(int i=0; i<inputString.length(); i+=count)
           {
           
           count=0;
                    for(int j=i+1; j<inputString.length(); j++)
                        {
                         
                            if(inputString.charAt(i)==inputString.charAt(j))
                                {
                                    count++;
                                    
                            }
                         if(j ==inputString.length()-1&&count==0)
                         {
                            num++;
                          
                             if(num>1)
                                 {
                                 break;
                             }
                     }
                    }
                if(inputString.length()%2==0 &&count%2==0||inputString.length()%2 != 0&&num>1)
                    {
                    ans="NO";
                    break;
                    
                }else{
                    ans="YES";
                }
            if(count==0)
                {
                count++;
            }else
                {
                count=count+1;
            }
                
            
       }
       
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
}
