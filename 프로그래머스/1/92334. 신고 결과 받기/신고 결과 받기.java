import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
    	HashMap<String,Integer> id = new HashMap<>();
    	for(int i=0; i<id_list.length;i++) {
    		id.put(id_list[i], i);
    	}
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<String,List<String>> main = new HashMap<>();
        ArrayList<String> find = new ArrayList<>();
        Set<String> duplicateCheck = new HashSet<>(); // 중복 확인용 Set
        int[] answer = new int[id_list.length];
        
        for(int i=0; i<report.length; i++){
        	if (!duplicateCheck.contains(report[i])) {
                duplicateCheck.add(report[i]);
        	
            String key = report[i].split(" ")[1];
            if(map.containsKey(key)){
                int value = map.get(key);
                map.put(key,value+1);
            }else{
                map.put(key,1);
            }
        	String mainKey = report[i].split(" ")[0];
            List<String> list = main.getOrDefault(mainKey, new ArrayList<>());
            list.add(report[i].split(" ")[1]);
            main.put(mainKey, list);
        	}
        }
        
        for(Map.Entry<String,Integer> entry : map.entrySet()) {
        	if(entry.getValue()>=k) {
        		find.add(entry.getKey());
        	}
        }
        for (Map.Entry<String, List<String>> entry : main.entrySet()) {
            String mainKey = entry.getKey();
            List<String> list = entry.getValue();
            for (String reportedId : find) {
                if (list.contains(reportedId)) {
                    answer[id.get(mainKey)]++;
                }
            }
        }
        return answer;
    }
}

/* k번 이상 신고 다하면 게시판 이용 정지
해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송
유저가 신고한 모든 내용을 취합하여 마지막에 한꺼번에 
게시판 이용 정지를 시키면서 정지 메일 발송
*/
