

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CompareStrings {

	public static void main( String[] args) throws Exception
	{
		String str1 = null;
		String str2 = null;
		BufferedReader breader1= new BufferedReader(new InputStreamReader(System.in));
		BufferedReader breader2= new BufferedReader(new InputStreamReader(System.in));
			try
			{
		str1 =breader1.readLine();	
		str2 = breader1.readLine();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		int result = CompareStrings.matchStrings(str1, str2);
		if(result==1)
		System.out.println("Strings match");
		else
			System.out.println("strings do not match");
	}

	
	
	public static int matchStrings(String s1, String s2)
	{
		
		char[] cs1 = s1.toCharArray();
		char[] cs2 = s2.toCharArray();
		
		if(s1.length()==0 || s2.length() == 0)
		{
			return 0;
		}
		if( s1.length()!=s2.length())
		
			return 0;
			int ch =0;
			int val1=0;
			int val2=0;
		for(int i= 0; i<cs1.length; i++)
		{
				System.out.println("this is cs1 "+cs1[i]);
			if(cs1[i]==cs2[i])
					ch=1;
			//	else 
				//	ch=0;
				
				else 
					if(cs1[i] != cs2[i])
					{  
						
						val1 = cs1[i];
						 val2 = cs2[i];
						 
						if(val1<val2)
						{	
							System.out.println(cs1[i] + "is smaller than" + cs2[i]);
						}
						else 
							System.out.println(cs2[i] + "is smaller than" + cs1[i]);
						ch=0;
					}	
				
		}
		return ch;
		
	}
}
