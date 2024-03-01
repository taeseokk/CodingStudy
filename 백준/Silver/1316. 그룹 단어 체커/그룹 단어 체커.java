import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int answer = n;
		for(int i=0; i<n; i++) {
			ArrayList<String> list = new ArrayList<>();
			String str = br.readLine();
			for(int j=0; j<str.length(); j++) {
				if(list.contains(str.substring(j, j+1))) {
					if(str.substring(j, j+1).equals(str.substring(j-1, j)) ) {
						continue;
					}else {
						answer--;
						break;
					}
				}
				else {
					list.add(str.substring(j,j+1));
				}
			}
			
		}
		System.out.println(answer);
	}
}
