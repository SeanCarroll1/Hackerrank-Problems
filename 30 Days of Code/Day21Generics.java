import java.lang.reflect.Method;

class Day21Generics {

		//Write your code here
	public static < E > void printArray( E[] inputArray )
	   {
		  // Display array elements  
		for(int i=0; i<inputArray.length; i++)
			{
			System.out.println( inputArray[i] );
		}
		   
			
		}
		
		    
    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        printArray( intArray  );
        printArray( stringArray );
        
        if(Solution.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}