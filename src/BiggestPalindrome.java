
public class BiggestPalindrome {

	
	public static void main(String[] args)
	{
		
		findHighestPrimePalindrome();
	}
	
	
	public static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	public static void findHighestPrimePalindrome()
	{
		int i=0;
		int big =0;
		

		for( i =1000 ; i >100; i--)
			{
				if(isPrime(i))
				{
			String str = Integer.toString(i);
			char[] chrarr = str.toCharArray();
			
			//System.out.println(str);
			if(chrarr[0]==chrarr[2])
			{
				//System.out.println("this is digit at hundredth place " + chrarr[0]);
				//System.out.println("this is digit at ones place" + chrarr[2]);
				if(i>big)
					big =i;
			}
		}
			}
		System.out.println(big);
		
	}
	
}
