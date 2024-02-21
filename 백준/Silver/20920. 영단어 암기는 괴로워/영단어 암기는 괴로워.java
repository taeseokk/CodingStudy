import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
		HashMap<String,Integer> map = new HashMap<>();
		int n = Integer.parseInt(st.nextToken()); // 단어의 수
		int m = Integer.parseInt(st.nextToken()); // 외울 단어의 길이 기준
		
		for(int i=0; i<n;i++) {
			String word = br.readLine();
			if(word.length()<m) continue;

				map.put(word, map.getOrDefault(word, 0)+1);

		}
		// keySet() : map에 있는 값 다 꺼내기 key=value
		List<String> list = map.keySet().stream().collect(Collectors.toList());
		
		list.sort((o1,o2)->{
			int a= map.get(o1);
			int b= map.get(o2);
			
			if(a==b) {
				if(o1.length()==o2.length()) {
					return o1.compareTo(o2); //사전순
				}
				return o2.length()-o1.length();
			}
			return b-a; // 자주 나오는 단어이면 앞에 배치
		});
		
		for(String words : list) {
			bw.write(words + "\n");
		}
		bw.flush();
        bw.close();

	}
}
