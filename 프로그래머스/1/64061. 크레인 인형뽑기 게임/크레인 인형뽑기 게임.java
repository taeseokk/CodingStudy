import java.util.*;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		for (int m = 0; m < moves.length; m++) {
			int line = moves[m] - 1;
			for (int i = 0; i < board.length; i++) {

				if (board[i][line] == 0) {
					continue;
				} else if (board[i][line] != 0) {
					if (stack.peek() == board[i][line]) {
						answer += 2;
						stack.pop();
					} else {
						stack.push(board[i][line]);
					}
					board[i][line] = 0;
					break;
				}
			}
		}
		return answer;
	}
}
