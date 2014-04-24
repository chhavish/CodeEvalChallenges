
public class Swap {
	
	
	int a ,b;
	Swap(int a, int b)
	{
		this.a = a;
		this.b =b;

	}
	public static void main(String[] args)
	{
		
		int c = 5;
		int d = 6;
		Swap sw = new Swap(c, d);
		sw.swapItems();
		
	}
	
		public void swapItems()
		{
			int temp;
			temp = b;
			b = a;
			a =temp;
			System.out.println(a);
			System.out.println(b);
			
		}

}
