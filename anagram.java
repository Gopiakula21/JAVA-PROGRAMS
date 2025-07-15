import java.util.Scanner;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        System.out.println("Anagram Program");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String:");
        String str1 = sc.nextLine();

        System.out.print("Enter second String:");
        String str2 = sc.nextLine();  // Corrected from str12 to str2

        // Remove all whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are equal
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagram of each other");
        } else {
            // Convert strings to char arrays and sort them
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean isAnagram = Arrays.equals(arr1, arr2);

            if (isAnagram) {
                System.out.println("The strings are anagram");
            } else {
                System.out.println("The strings are not anagram");
            }
        }

        sc.close();
    }
}