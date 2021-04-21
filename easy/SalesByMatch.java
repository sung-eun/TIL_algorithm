public class SalesByMatch {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        Map<Integer, Integer> map = new HashMap<>();

        int pairs = 0;
        for (int color : ar) {
            int count = map.getOrDefault(color, 0);
            if (count == 1) {
                pairs++;
                map.put(color, 0);
            } else {
                map.put(color, 1);
            }
        }

        return pairs;
    }
}
