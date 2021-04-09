import java.util.HashMap;
import java.util.Map;

//완주하지 못한 선수의 이름을 return

//제한사항
//참여한 선수의 수는 1명 이상 100,000명 이하
//completion.size는 participant.size보다 1 작다.
//참가자 이름은 1~20개의 알파벳 소문자
//동명이인이 있을 수 있다.

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> completionMap = new HashMap<>();

        for (String name : completion) {
            if (completionMap.containsKey(name)) {
                completionMap.put(name, completionMap.get(name) + 1);
            } else {
                completionMap.put(name, 1);
            }
        }

        String answer = "";
        for (String name : participant) {
            Integer value = completionMap.get(name); //개선점: getOrDefault() 사용해도 된다.
            if (value == null || value == 0) {
                answer = name;
                break;
            }
            completionMap.put(name, value - 1);
        }
        return answer;
    }
}
