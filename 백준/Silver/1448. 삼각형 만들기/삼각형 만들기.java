import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr); // 오름차순 정렬
		int len = arr.length - 1;
		int answer = -1;
		while (len-2 >= 0) {
			if (arr[len] >= arr[len - 1] + arr[len - 2]) {
				len--;
			} else {
				answer = arr[len] + arr[len - 1] + arr[len - 2];
				break;
			}
		}
		System.out.println(answer);
	}
}
