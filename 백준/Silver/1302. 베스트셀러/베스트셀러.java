import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();

		int max = 0;
		for (int i = 0; i < n; i++) {
			String book = br.readLine();

			map.put(book, map.getOrDefault(book, 0) + 1);
			max = Math.max(max, map.get(book));

		}
		List<String> list = new ArrayList<>();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()==max) {
				list.add(entry.getKey());
			}
		}
		Collections.sort(list);
		
		System.out.println(list.get(0));

	}
}