class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        String find = board[h][w];
        if(h+1<n&&board[h+1][w].equals(find)){
            answer++;
        }if(h-1>=0&&board[h-1][w].equals(find)){
            answer++;
        }if(w+1<n&&board[h][w+1].equals(find)){
            answer++;
        }if(w-1>=0&&board[h][w-1].equals(find)){
            answer++;
        }
        return answer;
    }
    
}