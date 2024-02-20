import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] count = new int[26];
		String st = br.readLine().toUpperCase();
		
		for(int i=0; i<st.length();i++) {
			int num = st.charAt(i) -'A' ;
            count[num]++;
		}
		int index = 0;
		int checkNum = 0;
		for(int i=0; i<count.length;i++) {
			if(count[i]>checkNum) {
				checkNum = count[i];
				index = i;
			}else if(count[i]>0&&count[i]==checkNum) {
				index = -2;
            }
		}
		
		System.out.println((char)(index+65));
		
		
		
	}

}
