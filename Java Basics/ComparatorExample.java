import java.util.*;

// Comparator to sort strings by length
class StringLengthComparator implements Comparator<String> {

    // Compare method for string length comparison
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1; // Return -1 if the first string is shorter
        } else if (s1.length() > s2.length()) {
            return 1;  // Return 1 if the first string is longer
        } else {
            return 0;  // Return 0 if they are of equal length
        }
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("kiwi");
        strings.add("pear");
        strings.add("watermelon");

        System.out.println("Before sorting:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Sort the list using StringLengthComparator
        Collections.sort(strings, new StringLengthComparator());

        System.out.println("\nAfter sorting by length:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
