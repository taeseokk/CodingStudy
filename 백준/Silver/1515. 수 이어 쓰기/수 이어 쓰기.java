import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String n = br.readLine();	// 지우고 남은 수
		int i=0; // 234092
		
		while(true) {
			i++;
			String check = Integer.toString(i);
			while(check.length()>0 && n.length()>0) {
				if(n.charAt(0)==check.charAt(0)) {
					n=n.substring(1);
				}
				check=check.substring(1);
			}
			if(n=="") {
				System.out.println(i);
				break;
			}
				
				
		}
		

	}
}
