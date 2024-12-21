class SolutionStringReplace {
    public int romanToInt(String s) {
        int total = 0;

        while (!s.isEmpty()) {
            if (s.contains("CM")) {
                total += 900;
                s = s.replaceFirst("CM", "");
            } else if (s.contains("CD")) {
                total += 400;
                s = s.replaceFirst("CD", "");
            } else if (s.contains("XC")) {
                total += 90;
                s = s.replaceFirst("XC", "");
            } else if (s.contains("XL")) {
                total += 40;
                s = s.replaceFirst("XL", "");
            } else if (s.contains("IX")) {
                total += 9;
                s = s.replaceFirst("IX", "");
            } else if (s.contains("IV")) {
                total += 4;
                s = s.replaceFirst("IV", "");
            } else if (s.contains("M")) {
                total += 1000;
                s = s.replaceFirst("M", "");
            } else if (s.contains("D")) {
                total += 500;
                s = s.replaceFirst("D", "");
            } else if (s.contains("C")) {
                total += 100;
                s = s.replaceFirst("C", "");
            } else if (s.contains("L")) {
                total += 50;
                s = s.replaceFirst("L", "");
            } else if (s.contains("X")) {
                total += 10;
                s = s.replaceFirst("X", "");
            } else if (s.contains("V")) {
                total += 5;
                s = s.replaceFirst("V", "");
            } else if (s.contains("I")) {
                total += 1;
                s = s.replaceFirst("I", "");
            }
        }

        return total;
    }
}