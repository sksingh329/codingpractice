package simple;

public class RemoveDuplicateFromLinkedList {
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList removeDuplicatesFromLinkedList(LinkedList linkedList) {
        // Write your code here.
        LinkedList currentNode = linkedList;
        while(currentNode != null){
            LinkedList nextDistinct = currentNode.next;
            while(nextDistinct != null && currentNode.value == nextDistinct.value){
                nextDistinct = nextDistinct.next;
            }
            currentNode.next = nextDistinct;
            currentNode = nextDistinct;
        }
        return linkedList;
    }
}
