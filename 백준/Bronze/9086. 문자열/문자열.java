  import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc.next();
            int last = s.length()-1;
            String answer = String.valueOf(s.charAt(0));
            String answer1 = String.valueOf(s.charAt(last));
            System.out.println(answer+answer1);
        }
    }
}