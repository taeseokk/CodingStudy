import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        

        for(int i=0; i<t; i++) {

            int count = 0;
            
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int[] arrA = new int[a];
            int[] arrB = new int[b];

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < a; j++) {
                arrA[j] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int k = 0; k < b; k++) {
                arrB[k] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arrB);

            for (int l = 0; l < a; l++) {
                int left = 0;
                int right = b - 1;
                int cnt = 0;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (arrB[mid] < arrA[l]) {
                        left = mid + 1;
                        cnt = mid + 1;
                    } else
                        right = mid - 1;
                }
                count += cnt;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);

    }
}