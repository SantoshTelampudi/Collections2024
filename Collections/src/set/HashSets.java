package set;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<String> hashset = new HashSet<String>();

        // Add elements to the sorted set
        hashset.add("Apple");
        hashset.add("Banana");
        hashset.add("Orange");
        hashset.add("Grape");
        hashset.add("Cherry");
        hashset.add("Cherry");

        // Print the sorted set (elements will be in alphabetical order)
        System.out.println("Sorted Set: " + hashset);

        // Iterate through the sorted set
        System.out.println("Iterating through the sorted set:");
        for (String fruit : hashset) {
            System.out.println(fruit);
        }

        // Get the first and last elements
     //   String firstElement = hashset.first();
     //   String lastElement = hashset.last();

    //    System.out.println("First Element: " + firstElement);
      //  System.out.println("Last Element: " + lastElement);

        // Remove an element
        hashset.remove("Orange");
        System.out.println("Sorted Set after removing 'Orange': " + hashset);

	}

}
