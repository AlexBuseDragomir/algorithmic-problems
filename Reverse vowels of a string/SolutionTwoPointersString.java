class SolutionTwoPointersString {

    public String reverseVowels(String s) {
        String vowels = "aAeEiIoOuU";

        char[] chars = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;
        char temp;

        while (start < end) {
            if (vowels.indexOf(chars[start]) == -1) {
                start ++;
            } else if (vowels.indexOf(chars[end]) == -1) {
                end --;
            } else if (vowels.indexOf(chars[start]) != -1 && vowels.indexOf(chars[end]) != -1) {
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