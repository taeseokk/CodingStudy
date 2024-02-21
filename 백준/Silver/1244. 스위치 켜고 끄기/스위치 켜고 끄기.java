
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		list.add(-1);

		for (int i = 0; i < num; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		int student = Integer.parseInt(br.readLine());

		for (int i = 0; i < student; i++) {
			st = new StringTokenizer(br.readLine());
			int type = Integer.parseInt(st.nextToken());
			int change = Integer.parseInt(st.nextToken());

			switch (type) {
			case 1:
				int index = 1;
				while (change*index <= num) {
					if (list.get(change*index) == 1) {
						list.set(change*index, 0);
					} else {
						list.set(change*index, 1);
					}
					index++;
				}
				break;

			case 2:
				int start = change - 1;
				int end = change + 1;

				while (start > 0 && end <= num) {
					if (list.get(start) != list.get(end))break;
					start--;
					end++;
				}
				start++;
				end--;
				for (int k = start; k <= end; k++) {
					if (list.get(k) == 1) {
						list.set(k, 0);
					} else {
						list.set(k, 1);
					}
				}
				break;

			}
		}
		for(int i=1; i<=num;i++) {
			System.out.print(list.get(i)+ " ");
			if(i%20 == 0) {
				System.out.println();
			}
		}

	}
}

// 1: on, 0: off
// 남학생 스위치 번호 : 자기가 받은 수의 배수