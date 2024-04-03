import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n,m,k,x;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		 n = Integer.parseInt(st.nextToken()); // 도시 수
		 m = Integer.parseInt(st.nextToken()); // 도로의 개수
		 k = Integer.parseInt(st.nextToken()); // 거리 정보
		 x = Integer.parseInt(st.nextToken()); // 출발 도시
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int front = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			list.get(front).add(end); // 단방향
		}
		int[] distance = new int[n+1];
		Arrays.fill(distance, -1);
		
		Queue<Integer> que = new LinkedList<>();
		que.offer(x);
		distance[x] = 0;
		while(!que.isEmpty()) {
			int now = que.poll();
			
			for(int i=0; i<list.get(now).size(); i++) {
				int next = list.get(now).get(i);
				if(distance[next]==-1) {
					distance[next] = distance[now]+1;
					que.offer(next);
					
				}
			}
		}
		
		for(int i=1; i<=n; i++) {
			if(distance[i]==k) {
				sb.append(i).append("\n");
			}
		}
		if(sb.length()==0) {
			System.out.println(-1);
		}else {
			System.out.println(sb);
		}
	
	
	}
}
