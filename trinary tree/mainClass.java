package Ques2;

public class mainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrinaryTree tree = new TrinaryTree();
		int [] a = {5, 4, 9, 5, 7, 2, 2};
		for(int i = 0;i<a.length;i++)
		{
			tree.insert(a[i]);
		}
		tree.display(tree.getRoot());
		System.out.println();
		System.out.println();
		boolean flag = tree.remove(5);
		if(flag)
		{
			System.out.println("Element Removed Successfully");
			tree.display(tree.getRoot());
		}
		else
		{
			System.out.println("Element Not Found");
		}	
	}

}
