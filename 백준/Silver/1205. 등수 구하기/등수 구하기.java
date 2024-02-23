import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int taesu = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());
		int rank = 1;
		if(n==0) {
			System.out.println(1); 
			return;
		}
		
		ArrayList<Integer> list =new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
//		Collections.sort(list,Collections.reverseOrder());
		
		if(list.size() == p && taesu <= list.get(list.size()-1)) {    // 등재가능한 랭킹리스트가 가득 차 있고 입력값이 그 최하위 값과 같거나 작다면 -1을 출력한다.
            System.out.println(-1);
            return;
        }
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)<=taesu) {
				rank = i+1;
				break;
			}else {
				rank++;
			}
		}
		if(rank>p) {
			System.out.println(-1);
		}else {
			System.out.println(rank);
		}

	}
}
