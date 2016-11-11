//\Write your code here

class Add
{
    public void add(int... nums) 
    {
        String result = "";
        int sum = 0;
        
        for (int n: nums) 
        {
            result += n + "+";
            sum += n;
        }
        
        System.out.println(result.substring(0, result.length() - 1) + "=" + sum);
    }
    
}

