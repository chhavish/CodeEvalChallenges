import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class StringRotation {
	
		
		 public static void main(String[] args)  throws Exception {
			 StringRotation rotate = new StringRotation();
			 boolean b = false;
			 int c=0 ;
			   // File file = new File(args[0]);
			 File file= new File("/Users/chhavisharma/Documents/testing/stringrotation.txt");
			    BufferedReader in = new BufferedReader(new FileReader(file));
			   // //System.out.println("Input contains");
			  //  //System.out.println(in.toString());
			    String line;
			    while ((line = in.readLine()) != null) {
//			    	System.out.println(line);
			        String[] lineArray = line.split(",");
			        
			        if (lineArray.length > 0) 
			        {		
			        	
			        	b= rotate.ifStringRotated(lineArray[0], lineArray[1]);
			        	c++;
			        	//b= rotate.ifStringRotated("CaNe8PYY2w1E8 vn3H6Ybt FCJQ","bt FCJQCaNe8PYY2w1E8 vn3H6Y");
			        	//b = rotate.ifStringRotated("zhP4Vhwv Pe11i61Nc13", "Vhwv Pe11i61Nc13zhP4");
			        	//System.out.println(lineArray[0]);
			        	//System.out.println(lineArray[1]);
			        	
			        	 System.out.println(b);
			        }
//			        System.out.println(c);
			       
			        
			    }
			    
		 }
	

	
	public boolean ifStringRotated(String s1, String s2)
	{
		String s3 = s1.toLowerCase() +s1.toLowerCase();
//		System.out.println("this is concatenated string" + s3);
		//s4.equalsIgnoreCase(s2);
		boolean isrotated =false;
		//char[] chararray = s3.toCharArray();
		//int len = s3.length();
		if(s1.length()!=s2.length())
			isrotated =false;
			
		if(s3.contains(s2.toLowerCase()))
			isrotated =true;
		return isrotated;
		
		
	}
}
