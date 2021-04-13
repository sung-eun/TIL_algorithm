public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int period = 0;
            if (i + 1 < prices.length) {
                for (int j = i + 1; j < prices.length; j++) {
                    period++;
                    if (prices[j] < price) {
                        break;
                    }
                }
            }
            answer[i] = period;
        }
        return answer;
    }
}
