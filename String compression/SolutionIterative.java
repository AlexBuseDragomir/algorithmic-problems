class SolutionIterative {

    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }

        char current = chars[0];

        StringBuilder result = new StringBuilder();
        result.append(current);

        int counter = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != current) {
                if (counter > 1) {
                    result.append(counter);
                }

                result.append(chars[i]);

                current = chars[i];
                counter = 1;
            } else {
                counter++;
            }
        }

        if (counter > 1) {
            result.append(counter);
        }

        System.arraycopy(result.toString().toCharArray(), 0, chars, 0, result.length());

        return result.length();
    }
}