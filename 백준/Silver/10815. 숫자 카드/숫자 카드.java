import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n, m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);

		m = Integer.parseInt(br.readLine());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int check = Integer.parseInt(st.nextToken());

			if (bs(check,arr)) {
				sb.append(1).append(" ");
			} else {
				sb.append(0).append(" ");
			}
		}

		System.out.println(sb);

	}

	static boolean bs(int num, int[] arr) {
		int left = 0;
		int right = n - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			int index = arr[mid];

			if (num < index) 
				right = mid - 1;
			else if (num > index) 
				left = mid + 1;
			 else 
				return true;
			
		}
		return false;
	}

}
