import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[10];
		
		int num = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		
		String str = String.valueOf(num);
		
		for(int i=0; i<str.length(); i++) {
			int index = Integer.parseInt(str.substring(i,i+1));
			arr[index] = arr[index]+1;
		}
		for(int n : arr) {
			System.out.println(n);
		}
	}
}

