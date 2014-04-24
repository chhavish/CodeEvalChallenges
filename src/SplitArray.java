/**
 * 
 */
/**
 * @author chhavisharma
 *
 */


class SplitArray
{
	public static void main(String[] args) throws java.lang.Exception
	{
		int[] arraysplit1 = {4,5,6,7,9,1,4};
		int[] arraysplit2 = { 6,7,1,5, 10,5, 9};
		int[] arraysplit3 = {-6,-5, 10, -3, 2};
		SplitArray eq = new SplitArray();
		
		boolean result1 =eq.isSplitable(arraysplit1);
		boolean result2 =eq.isSplitable(arraysplit2);
		boolean result3 =eq.isSplitable(arraysplit3);
	
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

	
	public boolean isSplitable(int[] arraysplit)
	{			
		boolean split=true;
		int sum1 =0;
		for( int i = 0; i< arraysplit.length-1; i++)
		{		
				int sum2 =0;
				sum1 = sum1 + arraysplit[i];
			for( int j= i+1; j<= arraysplit.length-1; j++)
			{
				 sum2 =0;
				sum2 = sum2 + arraysplit[j];
			}
			if( sum1 == sum2)
				split = false;
				
				break;
		}
			return split;
		
	}
	
	}
	
	
	
