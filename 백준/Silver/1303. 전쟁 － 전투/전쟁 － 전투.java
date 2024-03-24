import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] X = {0,0,-1,1};
	static int[] Y = {1,-1,0,0};
	static String[][] arr;
	static boolean[][] visited;
	static int[] answer = {0,0};
	static int nowX,nowY;
	static int n,m,count;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new String[m][n];
		visited = new boolean[m][n];

		for(int i=0; i<m; i++) {
			String str = br.readLine();
			for(int j=0; j<n; j++) {
				arr[i][j] = str.substring(j,j+1);				
			}
		}
		count = 1;
		for(int i=0; i<2; i++) {
			String s = "";
			if(i==0) {
				s = "W";
			}else {
				s = "B";
			}
			for(int j=0; j<m; j++) {
				for(int k=0; k<n; k++) {
					if(arr[j][k].equals(s) &&!visited[j][k]) {
						dfs(k,j,s);
						answer[i] = answer[i]+count*count;
						count = 1;
					}
				}
			}
		}
		System.out.println(answer[0]+ " " + answer[1]);
	}
	static void dfs(int x, int y, String check) {
		visited[y][x] = true;
		for(int i=0; i<4; i++) {
			nowX = x + X[i];
			nowY = y + Y[i];
			
			if(range() && visited[nowY][nowX]==false&& arr[nowY][nowX].equals(check)) {
				count++;
				dfs(nowX,nowY,check);				
			}
		}
	}
	

	static boolean range() {
		return (nowX >=0 && nowX < n && nowY>=0 && nowY<m);
	}
}
