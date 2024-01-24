import java.util.*;

class Solution {
	public String[] solution(String[] record) {
		HashMap<String, String> map = new HashMap<>();
		String[][] group = new String[record.length][3];

		for (int i = 0; i < record.length; i++) {
			group[i] = record[i].split(" ");
		}

		int index = 0;
        
		for (int i = 0; i < group.length; i++) {
			if (group[i][0].equals("Enter")) {
				map.put(group[i][1], group[i][2]);
			} else if (group[i][0].equals("Leave")) {
				continue;
			} else {
				map.put(group[i][1], group[i][2]);
				index++;
			}
		}

		String[] answer = new String[record.length - index];
		int idx = 0;
        
		for (int i = 0; i < group.length; i++) {
			if (group[i][0].equals("Enter")) {
				answer[idx++] = map.get(group[i][1]) + "님이 들어왔습니다.";
			} else if (group[i][0].equals("Leave")) {
				answer[idx++] = map.get(group[i][1]) + "님이 나갔습니다.";
			}
		}
		return answer;
	}
}