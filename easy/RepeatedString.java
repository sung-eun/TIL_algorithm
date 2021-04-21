class RepeatedString {
  
     // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        int length = s.length();

        if (length == 1 && s.equals("a")) {
            return n;
        }

        int result = 0;
        int aCount = 0;
        int remainedCount = (int) (n % length);
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == 'a') {
                aCount++;
                if (i < remainedCount) {
                    result++;
                }
            }
        }

        return result + aCount * (n / length);
    }
}
