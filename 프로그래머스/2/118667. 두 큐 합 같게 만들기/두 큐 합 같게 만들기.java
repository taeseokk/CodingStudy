import java.util.*;

class Solution {
	public int solution(int[] queue1, int[] queue2) {
		int answer = 0;
		long sum1 = 0;
		long sum2 = 0;
		Queue<Long> que1 = new LinkedList<>();
		Queue<Long> que2 = new LinkedList<>();

		for (int i = 0; i < queue1.length; i++) {
			que1.add((long) queue1[i]);
			sum1 += queue1[i];
            que2.add((long) queue2[i]);
			sum2 += queue2[i];
		}

		while (sum1 != sum2) {
            if(answer>queue1.length*4) return -1;
            long index=0;
			if (!(que1.isEmpty() || que2.isEmpty())) {
				if (sum1 > sum2) {
					index = que1.poll();
					que2.add(index);
					sum1 -= index;
					sum2 += index;
				} else if (sum1 < sum2) {
					index = que2.poll();
					que1.add(index);
					sum1 += index;
					sum2 -= index;
				}answer++;
 
            } else {
				return -1;
			}
		}
		return answer;

	}

}
