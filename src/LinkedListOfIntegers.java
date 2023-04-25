public class LinkedListOfIntegers {
        private Node head; // Reference to the first element of the linked list.
        private Node tail; // Reference to the last element of the linked list.
        private int count; // Counter for the number of elements that the list contains.
        private final int size; // Size of the linked list.

    public LinkedListOfIntegers(int size) {
        this.head = null;
        this.tail = null;
        this.count = 0;
        this.size = size;
    }
    
    // Method that receives an index and an element and adds it to the list.
    public void add(int index, int element) {
        if (index < 0 || index > count) { // Check if the passed index is valid.
            throw new IndexOutOfBoundsException("Invalid index.");
        }
    
        if (count == size) { // Check if the list has reached its maximum size.
            throw new IndexOutOfBoundsException("The list has reached its maximum size.");
        }
    
        Node n = new Node(element); // Create a new Node n with the passed element by reference.
    
        if (index == 0) { // If the index is 0, then head is n.
            n.next = head;
            head = n;
            if (count == 0) { // If count is 0, then it is the first element of the list, so n is tail.
                tail = n;
            }
        } else if (index == count) { // If the index is equal to count, then add it to the next free position and tail
            // will be the added element.
            tail.next = n;
            tail = n;
        } else { // If it will be inserted in the middle of the list.
            Node currentNode = head; // Create a new node that is the head of the list.
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next; // Loop until currentNode precedes the insertion node.
            }
            n.next = currentNode.next; // FORWARD INSERTION. The existing element is "pushed forward".
            currentNode.next = n;
        }
        count++; // Increment count.
    }
    // REPLACEMENT INSERTION. It would have to be n.next = currentNode.next.next.
    
    // Method that adds an element to the end of the list.
    public void add(int element) {
        add(this.count, element);
    }
    
    // Method that returns the element at the specified index.
    public int get(int index) {
        if (index < 0 || index >= count) { // Check if the passed index is valid.
            throw new IndexOutOfBoundsException();
        }
    
        Node currentNode = head; // Create a Node currentNode.
        for (int i = 0; i < index; i++) { // Loop through the list until the desired index is reached.
            currentNode = currentNode.next;
        }
    
        return currentNode.element; // Return the element at the index.
    }
    
    // Method that receives an element and an index, and replaces the existing element with the new one.
    public int set(int index, int element) {
        if (index < 0 || index >= count) { // Check if the passed index is valid.
            throw new IndexOutOfBoundsException("Invalid index.");
        }
    
        Node currentNode = head; // Create a Node currentNode.
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next; // Loop through the list until the desired index is reached.
        }
    
        int oldValue = currentNode.element; // Create an oldValue Node to store the element that will be removed.
        currentNode.element = element; // The element of the desired index is now the element passed by reference.
        return oldValue;
    }
    

    // Removes the first occurrence of the element passed as parameter and returns true if successful, false otherwise.
public boolean remove(int element) {
    Node currentNode = head;
    Node previousNode = null;

    while (currentNode != null) { // While currentNode is not null, it will iterate through the list.
        if (currentNode.element == element) { // If currentNode is equal to the element passed as parameter
            if (previousNode == null) {
                head = currentNode.next; // If the element is at the beginning, then head will be removed and head will
                                         // be the next Node.
            } else {
                previousNode.next = currentNode.next; // If not, the Node before the removed element will connect to the
                                                      // Node after the removed element.
            }

            if (currentNode.next == null) { // If the removed element is the last in the list, then tail will point to
                                            // the element before the removed Node.
                tail = previousNode;
            }

            count--; // Decrement count.
            return true; // Returns true if removed.
        }

        previousNode = currentNode;
        currentNode = currentNode.next; // Iterate through the list.
    }

    return false;
}

// Removes all occurrences of the element passed as parameter and returns true if successful, false otherwise.
public boolean removeAll(int element) {
    boolean removed = false; // Initialize the variable removed as false.
    while (remove(element)) { // Apply a loop. While the method remove(int element) returns true, it stays inside the loop
                              // until removing all occurrences of element.
        removed = true;
    }
    return removed;
}

// Removes the element indicated by index and returns its value.
public int removeByIndex(int index) {
    if (index < 0 || index >= this.count) { // Check if the passed index is valid.
        throw new IndexOutOfBoundsException("Invalid Index");
    }

    int removedElement;
    Node currentNode = head;
    Node previousNode = null;

    if (index == 0) { // If the element to be removed is at index 0, then
        removedElement = head.element; // Save the element to return later
        head = head.next; // Head becomes the next element
        count--; // Decrement count

        if (count == 0) { // If count is 0, then tail points to null
            tail = null;
        }
    } else if (index == count - 1) { // If removing the last position in the list, then tail becomes the element before the removed one
        removedElement = tail.element;
        tail = previousNode;
        count--; // Decrement count
    } else {
        for (int i = 0; i < index; i++) { // If removing an index from the middle of the list
            previousNode = currentNode;
            currentNode = currentNode.next; // Iterate through the list
        }

        removedElement = currentNode.element; // Save the element to be removed to return later
        previousNode.next = currentNode.next; // Previous of the removed one points to the next of the removed one
        count--; // Decrement count
    }

    return removedElement; // Returns the element that was removed.
}

// Method that returns true if the list is empty and false otherwise
public boolean isEmpty() {
    return (count == 0);
}

// Method that returns the number of items in the list
public int getSize() {
    return count;
}

// Method that returns true if the element is in the list and false otherwise.
public boolean contains(int element) {
    Node currentNode = head;

    while (currentNode != null) { // traverses the list
        if (currentNode.element == element) { // if found, return true
            return true;
        }
        currentNode = currentNode.next;
    }

    return false; // if not found, return false
}

// Method that returns the index of the first occurrence of the element
public int indexOf(int element) {
    Node currentNode = head;
    int index = 0;

    while (currentNode != null) { // traverses the list
        if (currentNode.element == element) {
            return index; // when found, return the index
        }
        index++; // increment index
        currentNode = currentNode.next;
    }

    return -1; // if not found, return -1
}

// Method that clears the list
public void clear() {
    head = null;
    tail = null;
    count = 0;
}

// Method that sorts the list in descending order. Selection Sort.
public void sort() {
    Node currentNode = head;

    while (currentNode != null) { // traverses the list
        Node maxNode = currentNode; // creates a maxNode and a innerNode for comparison
        Node innerNode = currentNode.next;

        while (innerNode != null) { // until the end of the list is reached
            if (innerNode.element > maxNode.element) { // if the value of innerNode is greater than maxNode
                maxNode = innerNode;
            }
            innerNode = innerNode.next;
        }

        int temp = currentNode.element;
        currentNode.element = maxNode.element;
        maxNode.element = temp;

        currentNode = currentNode.next;
    }
}

// Method that reverses the order of the list
public void reverse() {
    Node prevNode = null;
    Node currentNode = head;
    Node nextNode = null;

    while (currentNode != null) { // the algorithm changes the next and prev references of the current node, so that the successor becomes the predecessor, and vice versa.
        nextNode = currentNode.next;
        currentNode.next = prevNode;
        prevNode = currentNode;
        currentNode = nextNode;
    }

    // swaps the head and tail references to reverse the list.
    Node aux = head;
    head = tail;
    tail = aux;
}

// Method that returns only the items between start (inclusive) and end (exclusive)
public ListArrayOfIntegers getSubset(int start, int end) {
    if (start < 0 || end > count || start >= end) { // checks if the passed indices are valid
        throw new IllegalArgumentException("Invalid indices!");
    }

    ListArrayOfIntegers subsetList = new ListArrayOfIntegers(end + 1 - start); // creates a ListArrayOfIntegers with the quantity between start - end

    Node currentNode = head;
    int currentIndex = 0;
    while (currentNode != null && currentIndex <= end) { // traverses the list
        if (currentIndex >= start) { // if the index is greater than or equal to start, add the elements to the subsetList
            subsetList.add(currentNode.element);
        }
        currentNode = currentNode.next; // traverses the list
        currentIndex++; // increment index
		
        }

        return subsetList; // return itens; 
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();

        Node aux = head;

        while (aux != null) {
            s.append(aux.element.toString());
            aux = aux.next;
            if (aux != null)
                s.append(",");
        }

        return s.toString();
    }

}
