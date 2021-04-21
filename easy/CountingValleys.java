import java.io.*;

class CountingValleys {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int level = 0;
        int valleys = 0;
        for (int i = 0; i < steps; i++) {
            char ch = path.charAt(i);
            if (ch == 'U') {
                level++;
            } else if (ch == 'D') {
                if (level == 0) {
                    valleys++;
                }
                level--;
            }
        }
        return valleys;
    }

}
