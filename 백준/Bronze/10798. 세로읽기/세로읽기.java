import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[5][15];
        int max = 0;
        for(int i=0; i<arr.length; i++){
            String s = sc.next();
            if(max < s.length()){
                max = s.length();
            }
            for(int j=0; j<s.length(); j++){
                arr[i][j] = s.charAt(j);
            }
        }
        for(int i=0; i<max; i++){
            for(int j=0; j<5; j++){
                if(arr[j][i]=='\0'){
                    continue;
                }
                else{
                    sb.append(arr[j][i]);
                }
            }
        }
        System.out.print(sb);
    }
}