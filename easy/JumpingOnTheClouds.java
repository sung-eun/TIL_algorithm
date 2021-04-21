import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumpingOnTheClouds {
  
    static int jumpingOnClouds(int[] c) {
        int steps = 0;
        int safeClouds = 0;
        for (int cloud : c) {
            if (cloud == 0) {
                safeClouds++;
            }

            if (cloud == 1) {
                steps += getSafeSteps(safeClouds) + 1;
                safeClouds = 0;
            }
        }

        if (safeClouds > 1) {
            steps += getSafeSteps(safeClouds);
        }

        return steps;
    }

    private static int getSafeSteps(int safeClouds) {
        if (safeClouds < 1) return 0;
        if (safeClouds <= 3) return 1;

        if (safeClouds % 2 == 0) {
            return safeClouds / 2;
        }
        return safeClouds / 3 + 1;
    }

}
