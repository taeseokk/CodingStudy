import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A1 = Integer.parseInt(st.nextToken());
		int B1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int A2 = Integer.parseInt(st.nextToken());
		int B2 = Integer.parseInt(st.nextToken());
		
		int y = lcm(B1,B2);
		int x = A1*(y/B1) + A2*(y/B2);
		
		System.out.println(x/gcd(x,y)+ " " + y/gcd(x,y));
		
		
	}
	
	
	// 최대 공약수
	public static int gcd(int a, int b) {
		if(b==0) return a;
		return gcd(b, a%b);
	}
	
	// 최대 공배수 -> 두수의 곱에서 최대 공약수를 나눈 값
	public static int lcm(int a, int b) {
		return a*b/gcd(a,b);
	}
}