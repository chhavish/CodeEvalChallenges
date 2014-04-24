
public class TrieImpl {
	int value;
	TrieImpl[] list = new TrieImpl[26];
	public TrieImpl(int value)
	{
		this.value = value;
	//	TrieImpl[] list = new TrieImpl[26];
		
	}

class Node{
	Node left;
	Node right;
	int value;
}


public static void main()
{
	Node root = new Node();
	root.left = null;
	root.right = null;
	
	
}

}