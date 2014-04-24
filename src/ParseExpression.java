
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class ParseExpression {

	public static void main(String[] args) throws Exception
	{
		
		
	}
	
	
	public int evaluate(String str)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> alist = new ArrayList<String>();
		for( String s : alist)
		{
			if(s=="/")
			{
				
				int ch = s.indexOf(s);
				int result = Integer.parseInt(alist.get(ch-1)) / Integer.parseInt(alist.get(ch+1));
				String resultstr = result.t
				alist.add(ch, );
			}
			
			
		}
		
	}
}
