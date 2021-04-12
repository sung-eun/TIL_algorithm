import java.util.*;

class 전화번호목록 {
    // 전화번호 목록에서 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false, 그렇지 않으면 true
    
    public boolean solution(String[] phone_book) {
        Set<String> phoneNumSet = new HashSet<>(Arrays.asList(phone_book));

        for (String number : phoneNumSet) {
            for (int i = 1; i < number.length(); i++) {
                String substring = number.substring(0, i);
                if (phoneNumSet.contains(substring)) {
                    return false;
                }
            }
        }

        return true;
    }
}
