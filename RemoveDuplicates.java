import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        Set<T> seen = new HashSet<>();
        ArrayList<T> result = new ArrayList<>();

        for (T item : list) {
            if (seen.add(item)) {  // .add() returns false if element already exists in set
                result.add(item);
            }
        }

        return result;
    }

    // Main method to test the function
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);

        System.out.println("Original list: " + numbers);
        System.out.println("Without duplicates: " + removeDuplicates(numbers));

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("cherry");
        words.add("banana");

        System.out.println("\nOriginal list: " + words);
        System.out.println("Without duplicates: " + removeDuplicates(words));
    }
}
