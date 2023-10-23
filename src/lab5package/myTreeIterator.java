import java.util.Stack;
import BinarySearchTree.Node;
public class myTreeIterator implements ITreeIterator{

	@Override
	/*
	 * Created by: Samuel Fickett
	 * This method returns the Sequence Array of a given
	 * Binary Search Tree
	 * @param bst the given Binary Search Tree
	 * @return the sequence array made
	 */
	public int[] SequeneceArray(BinarySearchTree bst) {
		int[] seqArray = new int[bst.getSize()];
		Stack<Node> s = new Stack<Node>();
		s.add(bst.root); //Adds the root of the tree to the stack
		int i = 0;
		
		/*
		 * This for loop runs through the entire tree using the stack     
		 * created in line 17. I add each node of the tree in order, 
		 * and return each node if each of its children is null,
		 * signalling the end of a specific line in the tree.
		 */
		while (!s.isEmpty()) {
			Node temp = s.pop();
			
			if (temp.left == null && temp.right == null) {
				seqArray[i++] = temp.size;
			}
			
			if (temp.left != null) {
				s.push(temp.left);
			}
			
			if (temp.right != null) {
				s.push(temp.right);
			}
		}	
	}
}
