class SolutionStringBuilder {

    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        StringBuilder builder = new StringBuilder();

        for (int i = words.length - 1; i > 0; i--) {
            builder.append(words[i]);
            builder.append(' ');
        }
        
        builder.append(words[0]);

        return builder.toString();
    }
}