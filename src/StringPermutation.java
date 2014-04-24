
public class StringPermutation {
	public static void main(String[] args)
	{
		PrintPar(3);
		
		
	}
	
	public static void printPar(int l, int r, char[] str, int count)
	
	{
	if(l< 0 && r <1)
		System.out.println("No legal combination exists");
	else 
		if( l==0 && r==0)
			System.out.println(str);
		else
		{
			if(l>0)
			{
			str[count]='(';
			printPar(l-1, r, str, count+1);
			
			}
			if(r>l)
			{
				str[count] = ')';
				printPar(l, r-1, str, count+1);
				
			}
		}
		
	}
	
	public static void PrintPar(int count)
	{
		char[] str = new char[count*2];
		printPar(count, count, str, 0);
		
	}
	
	

}
