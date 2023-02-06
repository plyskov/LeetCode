package Task1528;

class Solution {
    public String restoreString(String s, int[] indices) {

        char[] symbols = s.toCharArray();
        char[] newSymbols = new char[indices.length];

        for (int i = 0; i < indices.length; i++) {
            newSymbols[indices[i]] = symbols[i];
        }

        return new String(newSymbols);
    }
}
