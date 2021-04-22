class 2DArray_DS {
    static int hourglassSum(int[][] arr) {
        int n = arr.length;

        if (n < 3) return 0;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int sum = arr[i + 1][j + 1];
                for (int k = j; k < j + 3; k++) {
                    sum += (arr[i][k] + arr[i + 2][k]);
                }

                max = Math.max(max, sum);
            }
        }
        
        return max;

    } 
}
