package lab5package;

public class lab5 {

    public static void main(String[] args) {
       myBinarySearchTree myBST = new myBinarySearchTree();
       myTreeIterator myTI = new myTreeIterator();
       TreeIteratorTesting testTI = new TreeIteratorTesting(myBST, myTI);
       double average = testTI.average();
       int max = testTI.max();
       
       System.out.println(average);
       System.out.println(max);
    }

}
