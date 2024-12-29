class SolutionVerticalScanning {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        if (strs[0].isEmpty()) {
            return "";
        }

        StringBuilder longestPrefix = new StringBuilder();
        char currentLetter;
        char newLetter;
        int position = 0;

        while (true) {
            newLetter = strs[0].length() > position ? strs[0].charAt(position) : '\0';

            if (newLetter == '\0') {
                break;
            }

            for (int i = 1; i < strs.length; i++) {
                currentLetter = strs[i].length() > position ? strs[i].charAt(position) : '\0';
                if (newLetter != currentLetter) {
                    newLetter = '\0';
                }
            }

            if (newLetter != '\0') {
                longestPrefix.append(newLetter);
                position++;
            } else {
                break;
            }
        }

        return longestPrefix.toString();
    }
}