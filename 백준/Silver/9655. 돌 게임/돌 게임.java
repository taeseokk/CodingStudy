import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int count = 0;
		while(n>0) {
			if(n-3>=3) {
				n -=3;
				count++;
			}else {
				n--;
				count++;
			}
		}
		if(count%2==1) {
			System.out.println("SK");
		}else {
			System.out.println("CY");
		}
	}
}