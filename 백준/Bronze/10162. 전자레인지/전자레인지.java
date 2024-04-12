import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		int t = Integer.parseInt(br.readLine());
		
		int A = t/600;
		
		t %=600;
		
		int B = t/60;
		
		t %=60;
		
		int C = t/10;
		
		if(t%10 !=0) {
			sb.append("-1");
		}else {
			sb.append(A).append(" ").append(B).append(" ").append(C);
		}
		
		System.out.println(sb);
		
//a : 300초, b : 60초 , c : 10초
		
	}
}