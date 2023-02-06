package Task1528;

import java.util.Arrays;

public class SolutionDemo {

    public static void main(String[] args) {
        String testString = "codeleet";
        int[] testIndices = new int[] {4,5,6,7,0,2,1,3};

        Solution solution = new Solution();

        String result = solution.restoreString(testString, testIndices);

        System.out.println("In:                 " + testString);
        System.out.println("Indexes to replace: " + Arrays.toString(testIndices));
        System.out.println("Out:                " + result);

    }

}
