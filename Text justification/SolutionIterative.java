import java.util.ArrayList;
import java.util.List;

class SolutionIterative {

    public List<String> fullJustify(String[] words, int maxWidth) {
        List<List<String>> lines = splitWordsIntoLines(words, maxWidth);

        List<String> processedLines = new ArrayList<>();
        for (int i = 0; i < lines.size() - 1; i++) {
            processedLines.add(fullJustifyLine(lines.get(i), maxWidth));
        }

        processedLines.add(leftJustifyLine(lines.getLast(), maxWidth));
        return processedLines;
    }

    private String leftJustifyLine(List<String> line, int maxWidth) {
        int numberOfWords = line.size();
        int numberOfSpaceAreas = numberOfWords - 1;

        int numberOfLetters = line.stream().mapToInt(String::length).sum();
        int remainingSpace = maxWidth - numberOfLetters;
        int remainingSpaceAtTheEnd = remainingSpace - numberOfSpaceAreas;

        String leftJustifiedLine = String.join(" ", line);
        return leftJustifiedLine + " ".repeat(remainingSpaceAtTheEnd);
    }

    private String fullJustifyLine(List<String> line, int maxWidth) {
        int numberOfWords = line.size();
        int numberOfSpaceAreas = numberOfWords - 1;

        int numberOfLetters = line.stream().mapToInt(String::length).sum();
        int remainingSpace = maxWidth - numberOfLetters;

        if (numberOfWords == 1) {
            return line.getFirst() + " ".repeat(remainingSpace);
        }

        return fullJustifyLine(line, remainingSpace, numberOfSpaceAreas);
    }

    private String fullJustifyLine(List<String> line, int remainingSpace, int numberOfSpaceAreas) {
        int numberOfSpacesPerArea = remainingSpace / numberOfSpaceAreas;
        int additionalOneSpaceAreas = remainingSpace % numberOfSpaceAreas;

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < line.size() - 1; i ++) {
            stringBuilder.append(line.get(i));
            if (i < additionalOneSpaceAreas) {
                stringBuilder.append(" ".repeat(numberOfSpacesPerArea + 1));
            } else {
                stringBuilder.append(" ".repeat(numberOfSpacesPerArea));
            }
        }
        stringBuilder.append(line.getLast());
        return stringBuilder.toString();
    }

    private List<List<String>> splitWordsIntoLines(String[] words, int maxWidth) {
        List<List<String>> processedWords = new ArrayList<>();

        int wordIndex = 0;
        while (wordIndex < words.length) {
            int currentRowLength = 0;
            List<String> currentRow = new ArrayList<>();

            while (currentRowLength < maxWidth && wordIndex < words.length) {
                String currentWord = words[wordIndex];
                if (currentRowLength != 0) {
                    currentRowLength += currentWord.length() + 1;
                } else {
                    currentRowLength += currentWord.length();
                }

                if (currentRowLength <= maxWidth) {
                    currentRow.add(currentWord);
                    wordIndex ++;
                }
            }

            processedWords.add(currentRow);
        }

        return processedWords;
    }
}