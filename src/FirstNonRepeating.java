import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class FirstNonRepeating {
	
	public static void main(String[] args) 
	{	
		try{
		//BufferedReader bufferedReader =  new  BufferedReader(new InputStreamReader(System.in));
		//File file = new File(args[0]);
			File file = new File("/Users/chhavisharma/Documents/Nonrepeating.txt");
	    BufferedReader in = new BufferedReader(new FileReader(file));
	    String line;
	    while ((line = in.readLine()) != null) {
	        String[] lineArray = line.split("\\s");
	        if (lineArray.length > 0) {
	        	for( int i=0; i< lineArray.length; i++)
	        	{
		FirstNonRepeating firstNonRepeating = new FirstNonRepeating();
		char c =firstNonRepeating.findFirstNonRepeating(lineArray[i]);
		System.out.println(c);
	        }
	    }
	    }
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    }
	    

	public Character findFirstNonRepeating(String str)
	{
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		Character c ;
		int strlen = str.length();
		int i;
		for(i =0; i< strlen; i++)
		{
		c = str.charAt(i);
		
		if(hashMap.containsKey(c))
		{
			hashMap.put(c, hashMap.get(c)+1);
			
		}
		
		else
			hashMap.put(c, 1);
		}
	
		for( i=0; i< strlen; i++)
		{	
			c = str.charAt(i);
			if(hashMap.get(c)==1)
			{
				
				return c;
			}
				
		}
		return null;
	}

}
