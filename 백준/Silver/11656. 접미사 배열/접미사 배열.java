import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());

        String s = br.readLine();
        int len = s.length();

        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<len; i++){
            list.add(s.substring(i,len));
        }

        Collections.sort(list);

        for(int i=0; i<len; i++){
            System.out.println(list.get(i));
        }
    }
}