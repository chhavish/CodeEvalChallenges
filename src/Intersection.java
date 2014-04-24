

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;




public class Intersection {

	public static void main(String[] args) 
	{
		try{
		
		//Scanner scanfile = new Scanner(new File(args[0]));
		
		//String str = scanfile.nextLine();
		
		
			
			File file = new File(args[0]);
		    BufferedReader in = new BufferedReader(new FileReader(file));
		    String line;
		    while ((line = in.readLine()) != null) {
		        String[] lineArray = line.split("\\s");
		        if (lineArray.length > 0) {
		        	for( int i =0 ; i< lineArray.length; i++)
		        	{
		        	String[] strarray1 = lineArray[i].split(";");
		        	String[] splitoncomma0 =  strarray1[0].split(",");
		    		String[] splitoncomma1 =  strarray1[1].split(","); 
		//String[] array3 = new String[splitoncomma0.length];
		String[] array3 = new String[splitoncomma0.length];
		
		Intersection a = new Intersection();
		//array3= a.intersect(splitoncomma0, splitoncomma1);
		a.intersect(splitoncomma0, splitoncomma1);
/*		for( int j = 0; i<array3.length; j++)
		{
		System.out.println(array3[j]);
		} */
		        } 
		    }
		    }
		    }catch(Exception e) {e.printStackTrace();}
		}
	public void intersect(String a[], String b[])
	
	{ 	
		String[] array3 = new String[a.length];
			
			
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for( int i = 0; i< a.length; i++)
		{
				hm.put(a[i], 1);
			
		}
		int k =0;
		for( int j=0; j<b.length; j++)
		{
			if(hm.get(b[j])!=null)
					{
							array3[k] = b[j];
							k++;
							System.out.println(b[j]);
					}
			
		}
		
	}
	
}
