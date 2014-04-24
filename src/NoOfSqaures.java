
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NoOfSqaures {

	public static void main(String[] args)
	{
		System.out.println("Enter the size of the grid you want to count the squares for");
		Scanner in = new Scanner(System.in);
		int ch = in.nextInt();
		
		int squares = NoOfSqaures.findSquares(ch);
		System.out.println(squares);
	}
	
	
	public static int findSquares(int n)
	{
		int squares=0;
		for( int i =0; i< n; i++)
		{
		  squares = (n *(n+1)* (2*n+1) ) /6;
		}
		return squares;
	}
}
