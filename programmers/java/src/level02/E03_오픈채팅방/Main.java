package level02.E03_오픈채팅방;

import java.util.*;

class Solution {

    public String[] solution(String[] records) {
        StringBuilder sbRecord = new StringBuilder();
        List<String> answer = new ArrayList<>();
        HashMap<String, String> idAndNickName = new HashMap<>();

        for (String record : records){
            String[] splitedRecord = record.split(" ");

            // Leave 는 패쓰
            if (splitedRecord.length <= 2){
                continue;
            }

            String action = splitedRecord[0];
            String userId = splitedRecord[1];
            String nickName = splitedRecord[2];

            if ("Enter".equals(action)){
                idAndNickName.put(userId, nickName);
            }

            if ("Change".equals(action)){
                idAndNickName.put(userId, nickName);
            }
        }

        for (String record : records){
            String[] splitedRecord = record.split(" ");
            String action = splitedRecord[0];
            String userId = splitedRecord[1];

            if ("Enter".equals(action)){
                answer.add(idAndNickName.get(userId) + "님이 들어왔습니다.");
            }

            if ("Leave".equals(action)){
                answer.add(idAndNickName.get(userId) + "님이 나갔습니다.");
            }
        }

        return answer.stream()
                .toArray(arr -> new String[answer.size()]);
    }
}
