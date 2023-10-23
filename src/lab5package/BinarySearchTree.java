package lab5package;

public abstract class BinarySearchTree {
   
    
    protected int size;
    protected Node root;
    
    protected class Node{
        int data;
        Node left;
        Node right;
        
        public Node(int a) {
            data = a;
        }
    }
    
    public abstract boolean add(int data);
public int getSize() {
    return size;
    }

}
