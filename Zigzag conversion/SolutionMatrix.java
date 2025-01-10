
class SolutionMatrix {

    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        int numberOfLetters = s.length();
        char[][] matrix = new char[numRows][numberOfLetters];

        int column = 0;
        int letterNumber = 0;
        boolean shouldFillFullColumn = true;

        while(letterNumber < numberOfLetters) {
            if (shouldFillFullColumn) {
                for (int i = 0; i < numRows && letterNumber < numberOfLetters; i++) {
                    char ch = s.charAt(letterNumber);
                    letterNumber++;
                    matrix[i][column] = ch;
                }
                column++;
                shouldFillFullColumn = false;
            } else {
                for (int i = numRows - 2; i > 0 && letterNumber < numberOfLetters; i--) {
                    char ch = s.charAt(letterNumber);
                    letterNumber++;
                    matrix[i][column] = ch;
                    column++;
                }
                shouldFillFullColumn = true;
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] != 0) {
                    builder.append(matrix[i][j]);
                }
            }
        }

        return builder.toString();
    }
}