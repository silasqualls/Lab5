/**
 * defines the myBinarySearchTree object
 * and defines the add method for myBinarySearchTree objects
 * @author abigail pitcairn
 * @version 23 october 2023
 */

public class myBinarySearchTree extends BinarySearchTree {

    private int size;
    private Node right;
    private Node left;
    private Node root;
    private int data;
    private boolean addReturn;

    /**
     * construct an object for myBinarySearchTree
     */
    myBinarySearchTree(int data) {
        size = 0;
        data = null;
        root = null;
        right = null;
        left = null;
    }

    /**
     * add a Node<Integer> to a BinarySearchTree
     * @param item the integer to add
     * @return true if added, false if duplicate
     */
    public boolean add(Integer item){
        root = add(root,item);
        return addReturn;
    }

    /**
     * private helper method for public add method
     * @param localRoot the local root of the tree to add to
     * @param item the integer value to add to the tree
     * @return the new Node to add
     */
    private Node add(Node localRoot, Integer item){
        if (localRoot == null){
            addReturn = true;
            size++;
            return new Node(item);
        }
        
        else if (localRoot.data == item) {
            addReturn = false;
            return localRoot;
        }
        else if (localRoot.data < item) {
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        }
        else {
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }

}