import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int n = w-x;
        
        if(n>x){
            n = x;
        }
        if(n>y){
            n = y;
        }
        if(n>(h-y)){
            n = h-y;
        }
        System.out.print(n);
    }
}