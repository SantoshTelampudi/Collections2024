package set;

import java.util.*;

public class LinkedHashSets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> Lhashset = new LinkedHashSet<>();

		// Add elements to the sorted set
		Lhashset.add("Apple");
		Lhashset.add("Banana");
		Lhashset.add("Orange");
		Lhashset.add("Grape");
		Lhashset.add("Cherry");
		Lhashset.add("Cherry");
		
		// Print the sorted set (elements will be in alphabetical order)
		System.out.println("Sorted Set: " + Lhashset);

		// Iterate through the sorted set
		System.out.println("Iterating through the sorted set:");
		for (String fruit : Lhashset) {
			System.out.println(fruit);
		}

		// Get the first and last elements
		// String firstElement = hashset.first();
		// String lastElement = hashset.last();

		// System.out.println("First Element: " + firstElement);
		// System.out.println("Last Element: " + lastElement);

		// Remove an element
		Lhashset.remove("Orange");
		System.out.println("Sorted Set after removing 'Orange': " + Lhashset);

	}

}
/*
Let's consider a real-time example where you might choose between LinkedHashSet and HashSet based on the specific requirements of your application.

Scenario: Maintaining a User Activity Log

Imagine you are developing a user activity tracking system for a web application. You want to maintain a log of user actions, such as when they perform various activities like logging in, posting comments, and liking posts. Each activity will be associated with a timestamp.

Using LinkedHashSet:

In this scenario, you might choose a LinkedHashSet to maintain the user activity log. Here's why:

Ordering: You want to display the user's activities in chronological order. When you use a LinkedHashSet, the activities will automatically be stored in the order they occur. This is important for generating user timelines or activity feeds.

No Duplicates: You don't want duplicate activities in the log. Since LinkedHashSet automatically prevents duplicates, you won't have to implement duplicate-checking logic.

Here's how you could implement it:

java
Copy code
import java.util.LinkedHashSet;

public class UserActivityLog {
    private LinkedHashSet<String> activityLog = new LinkedHashSet<>();

    public void logActivity(String activity) {
        activityLog.add(activity);
    }

    public void displayUserActivityLog() {
        for (String activity : activityLog) {
            System.out.println(activity);
        }
    }
}
Using HashSet:

Now, let's consider a different scenario where you want to track unique IP addresses that have accessed your web server over a period of time. In this case, you don't need to maintain the order of access, and you want to optimize for quick lookups to check if an IP address has already been recorded.

java
Copy code
import java.util.HashSet;

public class IPAddressTracker {
    private HashSet<String> ipAddressSet = new HashSet<>();

    public void recordIPAddress(String ipAddress) {
        ipAddressSet.add(ipAddress);
    }

    public boolean hasRecordedIPAddress(String ipAddress) {
        return ipAddressSet.contains(ipAddress);
    }
}
In this scenario, you don't need the ordering guarantees provided by LinkedHashSet. You only need to quickly check if an IP address has been recorded, and HashSet is more suitable for this purpose.

These examples illustrate how you can choose between LinkedHashSet and HashSet based on your specific requirements in real-world scenarios. LinkedHashSet is useful when you need to maintain order, while HashSet is ideal when you prioritize performance and don't require order preservation.

*/