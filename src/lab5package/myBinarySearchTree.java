/**
 * defines the add method for BinarySearchTree objects
 * @author abigail pitcairn
 * @version 23 october 2023
 */

public class myBinarySearchTree extends BinarySearchTree {

    private boolean addReturn;


    /**
     * add a Node<Integer> to a BinarySearchTree
     * @param item the Integer to add
     * @return true if added, false if duplicate
     */
    public boolean add(Integer item){
        root = add(root,item);
        return addReturn;
    }

    /**
     * private helper method for public add method
     * @param localRoot the local root of the tree to add to
     * @param item the Integer value to add to the tree
     * @return the new Node<Integer> to add
     */
    private Node<Integer> add(Node<Integer> localRoot, Integer item){
        if (localRoot == null){
            addReturn = true;
            size++;
            Node<Integer> newNode = new Node<Integer>;
            newnode.data = item;
            return newNode;
        }
        else if (localRoot.data.compareTo(item)==0) {
            addReturn = false;
            return localRoot;
        }
        else if (localRoot.data.compareTo(item) < 0) {
            localRoot.left = add(localRoot.left, item);
            return localRoot;
        }
        else{
            localRoot.right = add(localRoot.right, item);
            return localRoot;
        }
    }

}