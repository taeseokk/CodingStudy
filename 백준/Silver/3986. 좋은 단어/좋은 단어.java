import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		for(int i=0; i<n; i++) {
			Stack<String> stack = new Stack<>();
			String str = br.readLine();
			stack.add(str.substring(0,1));
			for(int j=1; j<str.length(); j++) {
				if(!stack.isEmpty()&&stack.peek().equals(str.substring(j, j+1))) {
					stack.pop();
				}else {
					stack.add(str.substring(j,j+1));
				}
			}
			if(stack.isEmpty()) {
				count++;
			}
		}
		System.out.println(count);
	}
}

