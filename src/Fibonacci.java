import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Fibonacci {
    public static void main (String[] args) {
    	
    	Fibonacci fb = new Fibonacci();
    	int number=0;
    	
   try{
   // File file = new File(args[0]);
	   File file = new File("/Users/chhavisharma/Documents/fibonacci.txt");
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
        String[] lineArray = line.split("\\s");
        if (lineArray.length > 0) {
            //Process line of input Here
        	for(int i = 0; i<lineArray.length; i++)
        	{
        		
        		//System.out.println(lineArray[i]);
        			
        		number =fb.findNFibonacci(Integer.parseInt(lineArray[i]));
        	}
        	System.out.println(number);
        }
    }
  }catch(Exception e)
  {
	e.printStackTrace();  
  }
  }
    
    public int findNFibonacci(int num)
    
   {
    	
    	
    	if( num == 1 || num==0)
    		return num;
    	else
    		
    		return findNFibonacci(num-2) + findNFibonacci(num-1);
    	
    		
    	
   }
    
    
}

