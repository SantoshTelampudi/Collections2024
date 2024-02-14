package set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
        // Create a SortedSet of Strings (default natural ordering)
    	/*
    	 * A SortedSet in Java is an interface that extends the Set interface and represents a collection of elements that are stored in a sorted order. This means that the elements in a SortedSet are arranged based on their natural ordering or according to a specified comparator. The main characteristics of a SortedSet are:

Sorted Order: The elements in a SortedSet are always maintained in a specific order, which is determined either by the natural order of the elements or a custom comparator provided during the set's creation.

No Duplicates: Like the Set interface, a SortedSet does not allow duplicate elements. Each element in the set is unique.

Navigational Methods: SortedSet provides methods for navigating through the elements in a sorted manner. These methods include first(), last(), headSet(), tailSet(), and subSet(), which allow you to retrieve subsets of elements based on their order.

Performance: Implementations of SortedSet, such as TreeSet, are typically optimized for quick insertion, deletion, and retrieval of elements while maintaining the sorted order.

Immutability: Some SortedSet implementations may offer an immutable version of the set, which means that once created, the set cannot be modified.
    	 */
    	 
        SortedSet<String> sortedSet = new TreeSet<>();

        // Add elements to the sorted set
        sortedSet.add("Apple");
        sortedSet.add("Banana");
        sortedSet.add("Orange");
        sortedSet.add("Grape");
        sortedSet.add("Cherry");
        sortedSet.add("Cherry");
        

        // Print the sorted set (elements will be in alphabetical order)
        System.out.println("Sorted Set: " + sortedSet);

        // Iterate through the sorted set
        System.out.println("Iterating through the sorted set:");
        for (String fruit : sortedSet) {
            System.out.println(fruit);
        }

        // Get the first and last elements
        String firstElement = sortedSet.first();
        String lastElement = sortedSet.last();

        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // Remove an element
        sortedSet.remove("Orange");
        System.out.println("Sorted Set after removing 'Orange': " + sortedSet);
    }
}

