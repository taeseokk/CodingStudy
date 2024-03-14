import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> q = new LinkedList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int num = 1;
		
		for(int i=0; i<n; i++) {
			q.add(Integer.parseInt(st.nextToken()));
		}
		
		while(!q.isEmpty()) {
			if(q.peek()==num) {
				num++;
				q.poll();
			}else if(!stack.isEmpty()&&stack.peek()==num) {
				num++;
				stack.pop();
			}else {
				stack.push(q.poll());
			}
		}
		while(!stack.isEmpty()) {
			if(stack.peek()==num) {
				stack.pop();
				num++;
			}else {
				System.out.println("Sad");
				return;
			}
		}
		System.out.println("Nice");

	}
}