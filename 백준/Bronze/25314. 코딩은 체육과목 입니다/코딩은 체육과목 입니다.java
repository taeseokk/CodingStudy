import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n/4;
        for(int i=0; i<k; i++){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}