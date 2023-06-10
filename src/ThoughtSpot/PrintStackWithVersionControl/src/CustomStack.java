package ThoughtSpot.PrintStackWithVersionControl.src;

public class CustomStack {
    Node head;

    public Node push(int value) {
        Node node = new Node(value);
        if (this.head != null) {
            node.next = this.head;
        }
        this.head = node;
        return node;
    }

    public Node pop() throws Exception {
        if (head == null) {
            throw new Exception(ExceptionMessage.Empty_STACK.getMessage());
        }
        this.head = this.head.next;
        return this.head;
    }
}

