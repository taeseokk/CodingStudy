import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		char ch = s.charAt(0);
		int answer = 0;
		for (int i = 1; i < s.length(); i++) {
			if (ch == s.charAt(i)) {
				continue;
			} else {
				ch = s.charAt(i);
				answer++;
			}
			
		}

			System.out.println((answer/2)+answer%2);
	}
}