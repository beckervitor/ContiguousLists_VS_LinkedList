import java.util.Random;

public class TimeTest {

    public static void main(String[] args) {

        // create an array with 5000 positions
        ListArrayOfIntegers array = new ListArrayOfIntegers(5100);

        // create a linked list with 5000 positions
        LinkedListOfIntegers linked = new LinkedListOfIntegers(5100);

        // create a random object to generate random numbers
        Random random = new Random();

        for (int i = 0; i < 5000; i++) {
            array.add(random.nextInt(100));
            linked.add(random.nextInt(100));
        }

        System.out.println("\nCOMPARISON FOR METHOD add(int element): ");
        long startTime = System.nanoTime();
        array.add(26);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.add(26);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON FOR METHOD add(int index, int element): ");
        startTime = System.nanoTime();
        array.add(26, 2499);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.add(26, 2499);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON FOR METHOD get(int index): ");
        startTime = System.nanoTime();
        array.get(2499);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.get(2499);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON FOR METHOD set(int index, int element): ");
        startTime = System.nanoTime();
        array.set(2499, 99);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.set(2499, 99);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON FOR METHOD remove(int element): ");
        startTime = System.nanoTime();
        array.remove(10);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.remove(10);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON FOR METHOD removeAll(int element): ");
        startTime = System.nanoTime();
        array.removeAll(10);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.removeAll(10);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON OF METHOD removeByIndex(int index): ");
        startTime = System.nanoTime();
        array.removeByIndex(10);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.removeByIndex(10);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON OF METHOD isEmpty(): ");
        startTime = System.nanoTime();
        array.isEmpty();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.isEmpty();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON OF METHOD getSize(): ");
        startTime = System.nanoTime();
        array.getSize();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.getSize();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON OF METHOD contains(int element): ");
        startTime = System.nanoTime();
        array.contains(27);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.contains(27);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON OF METHOD indexOf(int element): ");
        startTime = System.nanoTime();
        array.indexOf(30);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.indexOf(30);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON OF METHOD sort(): ");
        startTime = System.nanoTime();
        array.sort();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.sort();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON OF METHOD reverse(): ");
        startTime = System.nanoTime();
        array.reverse();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.reverse();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON OF METHOD getSubset(int start, int end): ");
        startTime = System.nanoTime();
        array.getSubset(2000, 3000);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.getSubset(2000, 3000);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

        System.out.println("\nCOMPARISON METHOD clear(): ");
        startTime = System.nanoTime();
        array.clear();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ARRAYLIST:  " + duration + " nanoseconds");
        startTime = System.nanoTime();
        linked.clear();
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LINKEDLIST: " + duration + " nanoseconds \n");

    }

}
