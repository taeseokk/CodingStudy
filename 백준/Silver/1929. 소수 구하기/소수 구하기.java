import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());

		
		check = new boolean[n+1];
		

		for(int i=0; i<check.length; i++) {
			check[i]=true;
		}
		check[0]=check[1]=false;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(check[i]) {
				for(int j=i*i; j<=n; j+=i) {
					check[j]=false;
				}
			}
		}
		for(int i=m; i<=n; i++) {
			if(check[i]) {
				System.out.println(i);
			}else {
				continue;
			}
		}
	}
}
