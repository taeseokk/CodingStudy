import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		HashMap<Long, Integer> map = new HashMap<>();
		int max = 0;
		long answer = 0;
		for(int i=0; i<n; i++) {
			long k = Long.parseLong(br.readLine());
			
			map.put(k, map.getOrDefault(k, 0)+1);
			
			if(map.get(k)>max) {
				max = map.get(k);
				answer = k;
			}else if(map.get(k)== max) {
				answer = Math.min(answer, k);
			}
		}

		System.out.println(answer);
		
		
	}
}

