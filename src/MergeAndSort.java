
public class MergeAndSort {

	
	public static void main(String[]arg)
	{
		int[] A = new int[12];
		A[0] = 4;
		A[1] = 7;
		A[2] = 17;
		A[3] =34;
		A[4] = 38;
		A[5] = 40;
		
		
		int[] B = new int[6];
		B[0] = 2;
		B[1] = 15;
		B[2] = 27;
		B[3] =33;
		B[4] = 35;
		B[5] = 54;
		MergeAndSort mas =new MergeAndSort();
		A = mas.mergeSortArrays(A, B, 6, 6);
		for( int j =0; j <A.length; j++)
		System.out.println(A[j]);
	}
	
	public int[] mergeSortArrays(int[] A, int[] B, int n , int m)
	{
		System.out.println(A[0]);
		//A = new int[A.length+ B.length];
		System.out.println(A[0]);
		//B = new int[B.length];
		int i =n-1;
		int j =m-1;
		int k = n+m-1;
		while(i >=0 && j>=0)
		{
		
			if(A[i]>= B[j])
			{	A[k]= A[i];
			i--;
			k--;
			}
			else
				
				{
				A[k]= B[j];
				j--;
				k--;
				}
			
		}
		while(j>=0)
		{
			A[k]= B[j];
			k--;
			j--;
				
		}
		return A;
	}
}
