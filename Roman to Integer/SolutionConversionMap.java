import java.util.HashMap;
import java.util.Map;

class SolutionConversionMap {

    public int romanToInt(String s) {
        Map<Character, Integer> conversionMap = new HashMap<>();
        conversionMap.put('I', 1);
        conversionMap.put('V', 5);
        conversionMap.put('X', 10);
        conversionMap.put('L', 50);
        conversionMap.put('C', 100);
        conversionMap.put('D', 500);
        conversionMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = conversionMap.get(s.charAt(i));

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }
}