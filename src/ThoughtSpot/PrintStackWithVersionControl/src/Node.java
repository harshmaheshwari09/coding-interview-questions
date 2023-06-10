package ThoughtSpot.PrintStackWithVersionControl.src;

public class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public Node getNext() {
        return this.next;
    }
}
