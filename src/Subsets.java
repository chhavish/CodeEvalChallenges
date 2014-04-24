
public class Subsets {
	
	public static void main(String[] args)
	{	
		int[] setarray ={3,5,6,8,34,15};
		Subsets subset = new Subsets();
		subset.findSubsets(setarray);
		
	}
	
	public void findSubsets(int[] set)
	{
		for( int i =0; i< set.length; i++)
		{ 
			for( int j=i+1; j< set.length; j++)
			{
		
			System.out.println("{" + set[i] + "," + set[j] + "}");
			}
			
		}
		
	}


}
