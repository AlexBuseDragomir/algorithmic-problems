import java.util.HashSet;
import java.util.Set;

class SolutionTwoPointers {

    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('A');
        vowels.add('e');
        vowels.add('E');
        vowels.add('i');
        vowels.add('I');
        vowels.add('o');
        vowels.add('O');
        vowels.add('u');
        vowels.add('U');

        char[] chars = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;
        char temp;

        while (start < end) {
            if (!vowels.contains(chars[start])) {
                start ++;
            } else if (!vowels.contains(chars[end])) {
                end --;
            } else if (vowels.contains(chars[start]) && vowels.contains(chars[end])) {
                temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                start ++;
                end --;
            }
        }

        return new String(chars);
    }
}