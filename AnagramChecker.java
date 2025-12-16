public class AnagramChecker {
    public static boolean isAnagram(String str1, String str2) {
        // If lengths of strings are not equal, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create an array to count occurrences of characters (assuming ASCII characters)
        int[] charCount = new int[256];

        // Increment count for characters in str1
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
        }

        // Decrement count for characters in str2
        for (int i = 0; i < str2.length(); i++) {
            charCount[str2.charAt(i)]--;
        }

        // Check if all counts are 0
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        // If all counts are 0, the strings are anagrams
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
