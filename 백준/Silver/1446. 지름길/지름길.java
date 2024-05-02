import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static class Solution {
		int start;
		int end;
		int dist;

		Solution(int start, int end, int dist) {
			this.start = start;
			this.end = end;
			this.dist = dist;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()); // 지름길 개수
		int d = Integer.parseInt(st.nextToken()); // 고속도로의 길이

		ArrayList<Solution> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());
			if (end > d) // 종료가 최대 거리를 넘어가면 x
				continue;
			if (end - start > dist) { // 일반거리와 지름길을 비교해서 지름길이 최단일 때 add
				list.add(new Solution(start, end, dist));
			}

		}
		Collections.sort(list, Comparator.comparingInt((Solution s) -> s.start)
		            .thenComparingInt(s -> s.end)); // start가 같다면 end 기준으로 정렬
		

		int[] distance = new int[d+1];
		int move = 0;
		int index = 0;
		Arrays.fill(distance, Integer.MAX_VALUE);
		distance[0] = 0;
		
		while(move <d) {
			if(index < list.size()){
				Solution s = list.get(index);
				if(move==s.start) {
					distance[s.end] = Math.min(distance[move]+s.dist, distance[s.end]);
					index++;
				
				}else {
					distance[move+1] = Math.min(distance[move+1], distance[move]+1);
					move++;
				}
			}else {
				distance[move+1] = Math.min(distance[move+1], distance[move]+1);
				move++;
			}
		}
		System.out.println(distance[d]);
	}
}
