import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = s.length();
        int count =0;
        for(int i=0; i<k; i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='B'||s.charAt(i)=='C'){
                count = count+3;
            }
            else if(s.charAt(i)=='D'||s.charAt(i)=='E'||s.charAt(i)=='F'){
                count = count +4;
            }
            else if(s.charAt(i)=='G'||s.charAt(i)=='H'||s.charAt(i)=='I'){
                count = count +5;
            }
            else if(s.charAt(i)=='J'||s.charAt(i)=='K'||s.charAt(i)=='L'){
                count = count +6;
            }
            else if(s.charAt(i)=='M'||s.charAt(i)=='N'||s.charAt(i)=='O'){
                count = count +7;
            }
            else if(s.charAt(i)=='P'||s.charAt(i)=='Q'||s.charAt(i)=='R'||s.charAt(i)=='S'){
                count = count +8;
            }
            else if(s.charAt(i)=='T'||s.charAt(i)=='U'||s.charAt(i)=='V'){
                count = count +9;
            }
            else if(s.charAt(i)=='W'||s.charAt(i)=='X'||s.charAt(i)=='Y'||s.charAt(i)=='Z'){
                count = count +10;
            }
        }
        System.out.print(count);
    }
}