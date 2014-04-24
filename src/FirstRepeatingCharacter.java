import java.lang.reflect.Array;
import java.util.HashMap;


public class FirstRepeatingCharacter {
	
	public static  void main(String args[])
	{
		String s = "ytgnhjkmlc";
		FirstRepeatingCharacter frc = new FirstRepeatingCharacter();
		frc.isFirstDuplicate(s);
		
	}
	
		public void isFirstDuplicate(String s)
		{
			HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
			char[] string = s.toCharArray();
			for( char chr : string)
			{
				if(hmap.containsKey(chr))
				System.out.println( chr + "this is duplicate");
				
				else 
					hmap.put(chr, 1);
				
			}
			
			
			
			
		}
}
