import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[] X = {0,0,1,-1};
    static int[] Y = {1,-1,0,0};
    static HashSet<String> check;

    static String[][] arr;
    static int r,c;
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());


        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new String[r][c];


        for(int i=0; i<r; i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++) {
                arr[i][j] = s.substring(j, j + 1);
            }
        }
        check = new HashSet<>();

        dfs(0,0,1);

        System.out.println(answer);

    }
    
    static void dfs(int x, int y, int count){
        check.add(arr[y][x]);

        answer = Math.max(answer,count);

        for(int i=0; i<4; i++) {
            int newX = x + X[i];
            int newY = y + Y[i];

            if (range(newX, newY)) {
                if (!check.contains(arr[newY][newX])) {
                    dfs(newX, newY, count + 1);

                }
            }
        }
            check.remove(arr[y][x]);

    }


    static boolean range(int newX, int newY){
        return (newX>=0 && newY>=0 && newX<c && newY< r);
    }
}
