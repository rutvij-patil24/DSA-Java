import java.util.HashSet;

public class hashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store F1 driver names
        HashSet<String> drivers = new HashSet<>();

        // Adding elements to the HashSet
        drivers.add("Lewis Hamilton");
        drivers.add("Max Verstappen");
        drivers.add("Charles Leclerc");
        drivers.add("Fernando Alonso");
        drivers.add("Max Verstappen"); // Duplicate element, will not be added

        // Printing the HashSet
        System.out.println("F1 Drivers: " + drivers);

        // Check if a specific driver is in the HashSet
        System.out.println("Is Max Verstappen in the set? " + drivers.contains("Max Verstappen"));

        // Remove a driver
        drivers.remove("Fernando Alonso");

        // Check size of the HashSet
        System.out.println("Number of drivers in the set: " + drivers.size());

        // Iterate over the HashSet
        System.out.println("Remaining drivers:");
        for (String driver : drivers) {
            System.out.println(driver);
        }

        // Clear all elements in the HashSet
        // drivers.clear();

        // Check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + drivers.isEmpty());

        String[] driverArray = drivers.toArray(new String[0]);
        System.out.println("Driver Array: ");
        for(String driver : driverArray){
            System.out.println(driver);
        }
        
        HashSet<String> otherDrivers = new HashSet<>();
        
        boolean isEqual = drivers.equals(otherDrivers);
        System.out.println("Are the 2 hashSets equal? : "+ isEqual);

        int hash = drivers.hashCode();
        System.out.println(hash);

    }
}


// HashSet<String> drivers = new HashSet<>();: 
// This creates a HashSet of type String to store F1 driver names.

// drivers.add("Max Verstappen");: Adds "Max Verstappen" to the set. The HashSet does not allow duplicates, so if you try to add "Max Verstappen" again, it will not be added a second time.
// drivers.contains("Max Verstappen");: Checks if "Max Verstappen" is present in the set.
// drivers.remove("Fernando Alonso");: Removes "Fernando Alonso" from the set.
// drivers.size();: Returns the number of elements in the set.
// drivers.clear();: Removes all elements from the set.
// drivers.isEmpty();: Checks if the set is empty.




