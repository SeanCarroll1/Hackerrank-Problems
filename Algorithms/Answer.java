import java.util.*;

public class Answer {  

	public static void main(String [] args)
	{
		double [] y={22.2, 46, 100.8};
		double [] x={23, 11.1, 50.4};
		System.out.println(answer(y,x));
	}
	
	
    public static int answer(double[] y, double[] x) { 

        // Your code goes here.
        double ans=0;
		double []diff= new double[y.length];
		
            for(int i=0; i<y.length; i++)
            {
                
               // System.out.println(diff);
                for(int j=0; j<x.length; j++)
                {
					if(i==0)
					{
						diff[j]=((x[j]*100)/y[i]);
					}else
					{
						if(ArrayUtils.contains(diff,(x[j]*100)/y[i]))
						//if( DoubleStream.of(diff).anyMatch(x -> x == (x[j]*100)/y[i]))
						{
							ans=(x[j]*100)/y[i];
							break;
						}
						
					}
				//.out.println((x[i]*100)/y[i+1]);
                    /*if(diff==((x[j]*100)/y[i]))
                    {
                        ans=diff;
						System.out.println(ans);
                        break;
                    }*/
                }
            }
            return (int)ans;
    } 
}