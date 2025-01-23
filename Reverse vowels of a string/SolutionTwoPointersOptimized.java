import java.util.HashSet;
import java.util.Set;

class SolutionTwoPointersOptimized {

    public static String reverseVowels(String s) {
        if (s == null || s.length() <= 1) return s;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] chars = s.toCharArray();
        char temp;

        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) {
                left++;
            }

            while (left < right && !vowels.contains(chars[right])) {
                right--;
            }

            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}