import java.util.*;

public class Solution {
	public int[] solution(String msg) {
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int index = 1;
		for (int i = 'A'; i <= 'Z'; i++) {
			map.put(String.valueOf((char) i), index++);
		}
		int idx = 0;
		while (idx < msg.length()) {
			String w = "";
			while (idx < msg.length()) {
				if (!map.containsKey(w + msg.charAt(idx))) {
					break;
				} else {
					w += msg.charAt(idx);
				}
				idx++;
			}
			list.add(map.get(w));
			if (idx < msg.length()) {
				map.put(w + msg.charAt(idx), index++);
			}
		}

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}