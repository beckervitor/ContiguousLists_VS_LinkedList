public class Node {
    Integer element;
    Node next;

    public Node(Integer element) {
        this(element, null);
    }
    
    public Node(Integer element, Node next) {
        this.element = element;
        this.next = next;
    } 
}