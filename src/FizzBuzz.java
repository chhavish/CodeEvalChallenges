import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


public class FizzBuzz {

	public static void main(String[] args)
	{
		FizzBuzz buzz = new FizzBuzz();
		   
		    File file = new File("/Users/chhavisharma/Documents/workspace/PracticeBasics/src/fizzbuzz.txt");
		    try{
		    BufferedReader in = new BufferedReader(new FileReader(file));
		    String line;
		    while ((line = in.readLine()) != null) {
		        String[] lineArray = line.split("\\s");
		        if (lineArray.length > 0) 
		
		        		buzz.fizzBuzz(Integer.parseInt(lineArray[0]), Integer.parseInt(lineArray[1]), Integer.parseInt(lineArray[2]));
		        		System.out.println("\n");
		    }
		    }catch(Exception e)
		    {
		    	e.printStackTrace();
		    }
	}
	
	public void fizzBuzz(int a, int b, int n)
	{	
		//boolean flag_fizz =false;
		//boolean flag_buzz =false;
		
		for( int i=1; i<=n ; i++)
		{
			if( i % (a*b) == 0)
				System.out.print("FB ");
			else 
				if(i % a ==0 )
					System.out.print("F ");
				else
					if(i % b == 0)
						System.out.print("B ");
					else 
						System.out.print(i+ " ");
		}
	}
}
