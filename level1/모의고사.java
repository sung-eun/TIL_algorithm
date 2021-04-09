import java.util.ArrayList;
import java.util.List;

// 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
// 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
// 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

// 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 

// 제한조건
// 시험은 최대 10,000 문제
// 가장 높은 점수를 받은 사람이 여럿일 경우, 오름차순 정렬

class Solution {
    public int[] solution(int[] answers) {
        int[] pattern1 = {1, 2, 3, 4, 5};
        int patternSize1 = pattern1.length;

        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int patternSize2 = pattern2.length;

        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int patternSize3 = pattern3.length;

        int correctedCount1 = 0;
        int correctedCount2 = 0;
        int correctedCount3 = 0;
        
        int maximumCorrectAnswer = 0;

        for (int i = 0; i < answers.length; i++) {
            int correctAnswer = answers[i];

            if (correctAnswer == pattern1[i % patternSize1]) {
                correctedCount1++;
            }
            if (correctAnswer == pattern2[i % patternSize2]) {
                correctedCount2++;
            }
            if (correctAnswer == pattern3[i % patternSize3]) {
                correctedCount3++;
            }
        }

        maximumCorrectAnswer = Math.max(Math.max(correctedCount1, correctedCount2), correctedCount3);

        List<Integer> highestPersons = new ArrayList<>();
        if (correctedCount1 == maximumCorrectAnswer) {
            highestPersons.add(1);
        }
        if (correctedCount2 == maximumCorrectAnswer) {
            highestPersons.add(2);
        }
        if (correctedCount3 == maximumCorrectAnswer) {
            highestPersons.add(3);
        }

        int[] answer = new int[highestPersons.size()];
        for (int i = 0; i < highestPersons.size(); i++) {
            answer[i] = highestPersons.get(i);
        }
        return answer;
    }
}
