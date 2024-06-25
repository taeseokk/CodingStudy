import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] X = {1,-1,0,0};
    static int[] Y = {0,0,1,-1};
    static int n;
    static String[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        arr = new String[n][n];
        visited = new boolean[n][n];

        int count = 0;

        for(int i=0; i<n; i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                arr[i][j] = s.substring(j,j+1);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                String check = "";
                if(!visited[i][j]) {
                    checkRGB(i, j);
                    count++;
                }
                if(arr[i][j].equals("G")) arr[i][j] = "R";

            }
        }
        sb.append(count).append(" ");


        count = 0;
        visited = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j]){
                    checkRGB(i,j);
                    count++;
                }
            }
        }
        sb.append(count);

        System.out.println(sb);


    }

    static void checkRGB(int x, int y){
        visited[x][y] = true;
        String check = arr[x][y];
        for(int i=0; i<4; i++){
            int newX = x+X[i];
            int newY = y+Y[i];

            if(range(newX,newY) && !visited[newX][newY] && arr[newX][newY].equals(check)){
                checkRGB(newX,newY);
            }
        }
    }

    static boolean range(int newX, int newY){
        return (newX>=0 && newY>=0 && newX<n && newY<n);
    }
}