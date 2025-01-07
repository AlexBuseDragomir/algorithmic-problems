class SolutionArrays {

    public boolean isIsomorphic(String s, String t) {
        final int[] mappingSToT = new int[256];
        final int[] mappingTToS = new int[256];

        char sChar;
        char tChar;

        for (int i = 0; i < t.length(); i++) {
            sChar = s.charAt(i);
            tChar = t.charAt(i);

            if (mappingSToT[sChar] != 0) {
                if (mappingSToT[sChar] != tChar) {
                    return false;
                }
            } else {
                if (mappingTToS[tChar] != 0) {
                    return false;
                } else {
                    mappingSToT[sChar] = tChar;
                    mappingTToS[tChar] = sChar;
                }
            }
        }

        return true;
    }
}