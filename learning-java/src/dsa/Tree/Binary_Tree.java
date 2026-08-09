package dsa.Tree;

class Tree{
	int data;
	Tree left;
	Tree right;
	Tree(int value){
		data = value;
		left = null;
		right = null;
	}
	private Tree root;
	public void insert(int value) {
		 insertRecursive(root,value);
	}
	public void insertRecursive(Tree current,int value) {
		
	}
}
public class Binary_Tree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
