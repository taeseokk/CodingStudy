import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	static int X[] = { 0, 0, -1, 1 };
	static int Y[] = { -1, 1, 0, 0 };
	static int arr[][];
	static boolean visited[][];
	static List<Integer> list;

	static int now_x, now_y, n,count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		list = new ArrayList<>();
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visited = new boolean[n][n];
		count = 1;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(str.substring(j, j + 1));
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				if(arr[i][j] ==1 && !visited[i][j]) {
					dfs(j,i);
					list.add(count);
					count = 1;
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

	public static void dfs(int x, int y) {
		visited[y][x] = true;

		for (int i = 0; i < 4; i++) {
			now_x = x + X[i];
			now_y = y + Y[i];

			if (check() && visited[now_y][now_x] == false && arr[now_y][now_x]==1) {
				count++;
				dfs(now_x,now_y);
			}
			
		}
	}

	static boolean check() {
		return (now_x < n && now_x >= 0 && now_y < n && now_y >= 0);
	}
}