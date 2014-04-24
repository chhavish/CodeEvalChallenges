

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UniqueElements {

	
	public static void main(String args[])
	{
		//System.out.println("FIle name :" + args[0]);
		UniqueElements une = new UniqueElements();
		
		
		
		try{
			
			File file = new File("/Users/chhavisharma/Documents/workspace/PracticeBasics/src/input2.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		
		
		String line;
		while ((line = reader.readLine()) != null)
		{		ArrayList<Integer> uniquelist = new ArrayList<Integer>();
	        String[] lineArray = line.split(",");
	        
	        
	        if (lineArray.length > 0) {
	        	{		
	        		for(int i=0; i<lineArray.length; i++)
	        	
	        		{		
	        			//System.out.println(lineArray[i]);
	        				uniquelist.add(Integer.parseInt(lineArray[i]));
	        				
	        			
	        		}
	        		
	        		
	        		uniquelist =  une.removeDuplicates(uniquelist);
	        		
	        		StringBuilder temp = new StringBuilder();
	        		for(int i =0; i<uniquelist.size(); i++)
	        		{
	        			temp.append(uniquelist.get(i));
	        			temp.append(",");
	        			//System.out.print((uniquelist.get(i).toString()));
	        		}
	        		
	        		System.out.println(temp.substring(0, temp.length()-1));
	        		
	        	}
		
	        
		}
	      
	        
	        
	
		}
	
	}catch(Exception e)
	{ e.printStackTrace();}
	}
	        
	public ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
	{
		
		//Scanner scan = new Scanner(System.in);
	
		for(int i=0; i<list.size()-1; i++)
		{
			if(list.get(i)==list.get(i+1))
			{
				list.remove(i);
				i=i-1;
				//System.out.println(list.get(i+1));
			}
			
			
		}
		
		
		return list;
			
	}
}
