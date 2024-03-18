import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static boolean[] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		String num = br.readLine();
		int count = 0;
		int[] arr = new int[10];
		
		for(int i=0; i<num.length();i++) {
			int index = Integer.parseInt(num.substring(i,i+1));
			arr[index] +=1;
			count+=index;
		}
		if(count%3!=0||arr[0]==0) {
			System.out.println(-1);
			return;
		}

			for(int i = 9; i>=0; i--) {
				while(arr[i]!=0) {
					sb.append(i);
					arr[i]--;
				}
			}
			System.out.println(sb.toString());
	}
}
