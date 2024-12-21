class SolutionWhileLoop {
    public int romanToInt(String s) {
        int total = 0;
        int currentPos = 0;
        while(currentPos < s.length()) {
            if (s.charAt(currentPos) == 'M') {
                total +=1000;
                currentPos++;
            } else if (s.charAt(currentPos) == 'D') {
                total += 500;
                currentPos++;
            } else if (s.charAt(currentPos) == 'C') {
                if (currentPos >= s.length() - 1) {
                    total += 100;
                    currentPos++;
                } else if (s.charAt(currentPos + 1) == 'M') {
                    total += 900;
                    currentPos += 2;
                } else if (s.charAt(currentPos + 1) == 'D') {
                    total += 400;
                    currentPos += 2;
                } else {
                    total += 100;
                    currentPos++;
                }
            } else if (s.charAt(currentPos) == 'L') {
                total += 50;
                currentPos++;
            } else if (s.charAt(currentPos) == 'X') {
                if (currentPos >= s.length() - 1) {
                    total += 10;
                    currentPos++;
                } else if (s.charAt(currentPos + 1) == 'C') {
                    total += 90;
                    currentPos += 2;
                } else if (s.charAt(currentPos + 1) == 'L') {
                    total += 40;
                    currentPos += 2;
                } else {
                    total += 10;
                    currentPos++;
                }
            } else if (s.charAt(currentPos) == 'V') {
                total += 5;
                currentPos++;
            } else if (s.charAt(currentPos) == 'I') {
                if (currentPos >= s.length() - 1) {
                    total += 1;
                    currentPos++;
                } else if (s.charAt(currentPos + 1) == 'X') {
                    total += 9;
                    currentPos += 2;
                } else if (s.charAt(currentPos + 1) == 'V') {
                    total += 4;
                    currentPos += 2;
                } else {
                    total += 1;
                    currentPos++;
                }
            }
        }
        return total;
    }
}