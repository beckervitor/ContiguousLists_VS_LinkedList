public class ListArrayOfIntegers {

    // ATTRIBUTES
    private final int size;
    private Integer[] array;
    private int count;

    // method that constructs a list of size size.
    public ListArrayOfIntegers(int size) {
        this.size = size;
        this.array = new Integer[size];
        this.count = 0;
    }

    // method that adds an element to the end of the list
    public void add(Integer element) {
        if (count < size) { // checks if the counter is smaller than size
            array[count] = element; // adds element to position [count] of the array
            count++; // increments the counter
        } else {
            System.out.println("The list is full!"); // if not, throws an exception
        }
    }

    // method that adds an element to the list at the position indicated by index.
    public void add(int index, Integer element) {
        if (index >= 0 && index <= count) { // checks if index is within the possible size
            if (count < size) { // checks if the counter is smaller than the size of the list in order to be
                                // able to add
                for (int i = count - 1; i >= index; i--) { // while i is greater than or equal to the passed index, it
                                                           // decrements
                    array[i + 1] = array[i]; // shifts the elements of the array "forward" until reaching the index
                }
                array[index] = element; // adds element at the index
                count++; // increments the counter
            } else {
                System.out.println("The list is full!"); // if the counter is not smaller than size, returns a message
                                                         // indicating that the list is full
            }
        } else {
            throw new IndexOutOfBoundsException("Invalid index!"); // if the index is not valid for the list, throws an
                                                                   // exception
        }
    }

    // method that returns the element at the position indicated by index.
    public int get(int index) {
        if (index >= 0 && index < count) { // checks if index is within the bounds of the list
            return array[index]; // returns the element at the index position
        } else {
            throw new IndexOutOfBoundsException("Invalid index!"); // if not, throws an exception
        }
    }

    // method that replaces the value at the index position with the element passed
    // as a parameter and returns the old value.
    public int set(int index, int element) {
        if (index >= 0 && index < count) { // checks if index is within the bounds of the list
            int oldElement = array[index]; // stores the element to be removed in a variable
            array[index] = element; // replaces the old element with the new one
            return oldElement; // returns the removed element
        } else {
            throw new IndexOutOfBoundsException("Invalid index!"); // if the index is not valid for the list, throws an
                                                                   // exception.
        }
    }

    // Method that removes the first occurrence of the element passed as a parameter
    // and
    // returns true if successful, and false otherwise.
    public boolean remove(int element) {
        for (int i = 0; i < count; i++) { // loop to traverse the list
            if (array[i] != null && array[i].equals(element)) { // check for the first occurrence of the element passed
                                                                // (if it exists)
                for (int j = i; j < count - 1; j++) { // from the position where the element was removed, move until
                                                      // count - 1
                    array[j] = array[j + 1]; // shift all elements, from the position where the element was removed, to
                                             // the left
                }
                count--; // decrement count
                array[count] = null; // ensure that the last array is null since an element was removed from the
                                     // middle of the list
                return true;
            }
        }
        return false; // return false if the element is not found
    }

    // Method that removes all occurrences of the element passed as a parameter and
    // returns true if successful, and false otherwise.
    public boolean removeAll(int element) {
        boolean removed = false; // initialize the variable removed as false
        while (remove(element)) { // apply a loop. While the remove(int element) method returns true, stay inside
                                  // the loop until all occurrences of the element are removed.
            removed = true;
        }
        return removed;
    }

    // Method that removes the element indicated by index and returns its value
    public int removeByIndex(int index) {
        if (index >= 0 && index < count) { // check if index is within the bounds of the list
            int removed = array[index]; // store the element to be removed in a variable
            for (int i = index; i < count - 1; i++) { // loop to traverse the list from index i to count - 1
                array[i] = array[i + 1]; // remove all elements, from the removal position, to the left
            }
            count--; // decrement count
            return removed; // return the removed element
        } else {
            throw new IndexOutOfBoundsException("Invalid index!"); // if index is not valid for the list, throw an
                                                                   // exception
        }
    }

    // Method that returns true if the list is empty and false otherwise
    public boolean isEmpty() {
        return (count == 0);
    }

    // Method that returns the size (number of items) of the list
    public int getSize() {
        return count;
    }

    // Method that returns true if the element is in the list and false otherwise
    public boolean contains(int element) {
        for (int a : array) {
            if (a == element) {
                return true;
            }
        }
        return false;
    }

    // Method that returns the index of the first occurrence of the element.
    public int indexOf(int element) {
        for (int i = 0; i < count; i++) { // traverse the list
            if (array[i] != null && array[i].equals(element)) { // if the element is found, return the index i
                return i;
            }
        }
        return -1; // otherwise, return -1 indicating that the element was not found
    }

    // Method that clears the list
    public void clear() {
        for (int i = 0; i < count; i++) {
            array[i] = null;

        }
        count = 0;
    }

    public void sort() {
        // Uses the selection sort algorithm
        for (int i = 0; i < count - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (array[j] != null && array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }
    }

    public void reverse() {
        for (int i = 0; i < count / 2; i++) { // iterate until the middle of the list
            int aux = array[i]; // auxiliary variable holds the element at [i]
            array[i] = array[count - 1 - i]; // swap the element at position [i] with the element at position [count - 1
                                             // - i] where count is the size of the list
            array[count - 1 - i] = aux; // now, do the reverse, replace the element at position [count -1-i] with the
                                        // element from the auxiliary variable
        }
    }

    public ListArrayOfIntegers getSubset(int start, int end) {
        if (start < 0 || end > count || start >= end) { // check if start and end are valid
            throw new IllegalArgumentException("Invalid indices"); // if not valid, throw an exception
        }
        ListArrayOfIntegers subset = new ListArrayOfIntegers(end + 1 - start); // create a ListArrayOfIntegers with a
                                                                               // size equal to end-start
        for (int i = start; i <= end; i++) { // for indices from start to end, iterate through the list
            subset.add(array[i]); // add the element array[i] to the list
        }
        return subset; // return the array between start - end
    }

    public int Size() {
        return size;
    }

    public int count() {
        return count;
    }

    public int size() {
        return count;
    }

    public int capacity() {
        return size;
    }

    public String toString() {
        String aux;
        if (count == 0) {
            return "";
        }
        aux = "[";
        for (int i = 0; i < count - 1; i++) {
            aux += array[i] + ", ";
        }
        aux += array[count - 1] + "]";
        return aux;
    }
}
