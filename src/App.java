public class App {
    public static void main(String[] args) {
        
        System.out.println(
                "\n-----------------------------TESTING ARRAYLIST-------------------------------------------");
        ListArrayOfIntegers arrayList = new ListArrayOfIntegers(20);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(17);
        arrayList.add(19);
        arrayList.add(23);

        System.out.println("\n Initial list after adding elements: " + arrayList.toString());

        arrayList.add(11, 29);
        System.out.println("\n List after adding an integer at index 11: " + arrayList.toString());

        System.out.println("\n What is the element at index 0 of the list? " + arrayList.get(0));

        arrayList.set(0, 31);
        System.out.println("\n Changing the element at index 0 only: " + arrayList.toString());

        arrayList.remove(5);
        System.out.println("\n Removing the first element equal to 5: " + arrayList.toString());

        arrayList.removeAll(5);
        System.out.println("\n Removing all elements equal to 5: " + arrayList.toString());

        arrayList.removeByIndex(0);
        System.out.println("\n Removing the element at index 0: " + arrayList.toString());

        System.out.println("\n Is the list empty? " + arrayList.isEmpty());

        System.out.println("\n How many elements are in the list? " + arrayList.getSize());

        System.out.println("\n Does the list contain the element 7? " + arrayList.contains(7));

        System.out.println("\n What is the index of the element 7? " + arrayList.indexOf(7));

        arrayList.sort();
        System.out.println("\n Sorted list from largest to smallest element: " + arrayList.toString());

        arrayList.reverse();
        System.out.println("\n Reversed list: " + arrayList.toString());

        System.out.println("\n Elements from index 1-5 of the list: " + arrayList.getSubset(1, 5) + "\n");

        System.out.println(
                "\n-----------------------------TESTING LINKEDLIST-------------------------------------------");

        LinkedListOfIntegers linkedList = new LinkedListOfIntegers(20);

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(40);
        linkedList.add(40);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        linkedList.add(80);
        linkedList.add(90);
        linkedList.add(100);

        System.out.println("\n Initial list after adding elements: " + linkedList.toString());

        linkedList.add(11, 200);
        System.out.println("\n List after adding an integer at index 11: " + linkedList.toString());

        System.out.println("\n What is the element at index 0 of the list? " + linkedList.get(0));

        linkedList.set(0, 300);
        System.out.println("\n Changing the element at index 0 only: " + linkedList.toString());

        linkedList.remove(40);
        System.out.println("\n Removing the first element equal to 40: " + linkedList.toString());

        linkedList.removeAll(40);
        System.out.println("\n Removing all elements equal to 40: " + linkedList.toString());

        linkedList.removeByIndex(0);
        System.out.println("\n Removing the element at index 0: " + linkedList.toString());

        System.out.println("\n Is the list empty? " + linkedList.isEmpty());

        System.out.println("\n Number of elements in the list: " + linkedList.getSize());

        System.out.println("\n Is the element 90 present in the list? " + linkedList.contains(90));

        System.out.println("\n What is the index of the element 90? " + linkedList.indexOf(90));

        linkedList.sort();
        System.out.println("\n List sorted in descending order: " + linkedList.toString());

        linkedList.reverse();
        System.out.println("\n Reversed list: " + linkedList.toString());

        System.out.println("\n Elements at index 1-5 of the list: " + linkedList.getSubset(1, 5) + "\n");

    }

}
