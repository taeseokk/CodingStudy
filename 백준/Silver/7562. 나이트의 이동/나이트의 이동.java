import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] X = {1, 2, 2, 1, -1, -2, -2, -1};
    static int[] Y = {2, 1, -1, -2, -2, -1, 1, 2};;
	static int[][] arr;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;

		for (int i = 0; i < T; i++) {
			int len = Integer.parseInt(br.readLine());
			arr = new int[len][len];
			visited = new boolean[len][len];
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());

			bfs(x1, y1, x2, y2, len);
			sb.append(arr[x2][y2]).append("\n");

		}
		System.out.println(sb.toString());
	}

	static void bfs(int a, int b, int c, int d, int len) {
		Queue<int[]> que = new LinkedList<>();
		que.offer(new int[] { a, b });
		visited[a][b] = true;

		while (!que.isEmpty()) {
			int[] temp = que.poll();
			int cx = temp[0];
			int cy = temp[1];
			if (cx == c && cy == d)
				break;

			for (int i = 0; i < 8; i++) {
				int nX = cx + X[i];
				int nY = cy + Y[i];
				if(range(nX,nY,len) &&!visited[nX][nY]) {
					que.add(new int[] {nX,nY});
					arr[nX][nY] = arr[cx][cy]+1;
					visited[nX][nY] = true;
				}

			}
		}

	}

	static boolean range(int nx, int ny, int len) {
		return (nx >= 0 && ny >= 0 && nx < len && ny < len);
	}

}
