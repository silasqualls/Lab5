package lab5package;

public abstract class BinarySearchTree {
   
    
    protected int size;
    protected Node<Integer> root;
    
    protected class Node<Integer>{
        int data;
        Node<Integer> left;
        Node<Integer> right;
        
        public Node() {
            
        }
        
        public Node(int a) {
            data = a;
        }
    }
    
    public abstract boolean add(int data);
public int getSize() {
    return size;
    }

}
