import java.util.HashMap;


public class FirstRepeatingChar {
	
	public static void main(String[] args)
	{
		
		FirstRepeatingChar char1 = new FirstRepeatingChar();
		char chr = char1.findFirst("dghdhrtrvvmn");
		System.out.println(chr);
	}
		public Character findFirst(String str)
		
		{		
			HashMap<Character, Integer> hmap = new HashMap<>();
			Character c;
			int strlen = str.length();
			for(int i =0 ; i< strlen ; i++ )
			{
				c = str.charAt(i);
				//int s = str.indexOf("dhr");
				//System.out.println(s);
				//System.out.println(c);
				if( hmap.containsKey(c))
				{
					hmap.put(c, hmap.get(c)+1);
				}
				else
					hmap.put(c, 1);
			}
			
			for( int i =0; i<strlen; i++)
			{
				c = str.charAt(i);
				if(hmap.get(c) > 1)
				
					return c;
				
			}
			return null;
		}
		
}
