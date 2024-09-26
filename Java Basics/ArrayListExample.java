// ArrayList in Java:
// ArrayList is a resizable array implementation of the List interface in Java. 
// It allows dynamic arrays that can grow or shrink in size as needed, unlike regular 
// arrays with a fixed size. You can add, remove, or modify elements after creation.

// Key Points:
// Allows duplicate elements.
// Preserves the insertion order.
// Provides random access to elements (constant time O(1) access).
// Grows dynamically when more space is required.

// Common Methods of ArrayList:
// add(E e): Appends the specified element to the end of the list.
// add(int index, E element): Inserts the element at the specified index.
// remove(int index): Removes the element at the specified index.
// remove(Object o): Removes the first occurrence of the specified element.
// get(int index): Returns the element at the specified position.
// set(int index, E element): Replaces the element at the specified position with the specified element.
// size(): Returns the number of elements in the list.
// contains(Object o): Returns true if the list contains the specified element.
// indexOf(Object o): Returns the index of the first occurrence of the element, or -1 if it is not present.
// clear(): Removes all elements from the list.
// isEmpty(): Returns true if the list contains no elements.


import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of Strings
        ArrayList<String> drivers = new ArrayList<>();

        // Step 2: Add elements to the ArrayList
        drivers.add("Lewis Hamilton");  // Add at the end
        drivers.add("Max Verstappen");
        drivers.add("Charles Leclerc");

        // Step 3: Insert an element at a specific index
        drivers.add(1, "Sebastian Vettel");  // Inserts at index 1

        // Step 4: Print the ArrayList
        System.out.println("Current drivers: " + drivers);  // [Lewis Hamilton, Sebastian Vettel, Max Verstappen, Charles Leclerc]

        // Step 5: Access an element by index
        String firstDriver = drivers.get(0);  // Access the first element
        System.out.println("First driver: " + firstDriver);  // Output: Lewis Hamilton

        // Step 6: Remove an element by index
        drivers.remove(2);  // Removes Max Verstappen (index 2)
        System.out.println("After removal: " + drivers);  // [Lewis Hamilton, Sebastian Vettel, Charles Leclerc]

        // Step 7: Replace an element
        drivers.set(1, "Fernando Alonso");  // Replace Sebastian Vettel with Fernando Alonso
        System.out.println("After replacing: " + drivers);  // [Lewis Hamilton, Fernando Alonso, Charles Leclerc]

        // Step 8: Check the size of the ArrayList
        System.out.println("Number of drivers: " + drivers.size());  // Output: 3

        // Step 9: Check if the ArrayList contains an element
        boolean hasLeclerc = drivers.contains("Charles Leclerc");  // true
        System.out.println("Contains Charles Leclerc? " + hasLeclerc);

        // Step 10: Clear all elements from the list
        drivers.clear();
        System.out.println("After clearing: " + drivers);  // Output: []
        System.out.println("Is the list empty? " + drivers.isEmpty());  // Output: true
    }
}
