public class TreeIteratorTesting {
    private int[] sequenceArray;

    public TreeIteratorTesting(BinarySearchTree bst, ITreeIterator treeIter) {
       
        bst.add(10);
        bst.add(5);
        bst.add(15);
        bst.add(3);
        bst.add(7);
        bst.add(12);
        bst.add(17);

     
        this.sequenceArray = treeIter.SequenceArray(bst);
    }

    public double average() {
        if (sequenceArray == null || sequenceArray.length == 0) {
            return 0;
        }
        
        double sum = 0;
        for (int value : sequenceArray) {
            sum += value;
        }
        return sum / sequenceArray.length;
    }

    public int max() {
        if (sequenceArray == null || sequenceArray.length == 0) {
            throw new RuntimeException("No elements in the tree");
        }
        
        int maxValue = sequenceArray[0];
        for (int value : sequenceArray) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}



