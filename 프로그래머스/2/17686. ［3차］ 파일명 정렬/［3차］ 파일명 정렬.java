import java.util.*;

class Solution {
    public String[] solution(String[] files) {
        Arrays.sort(files, (s1, s2) -> {
            String[] file1 = fileArr(s1);
            String[] file2 = fileArr(s2);

            int sequence = file1[0].compareTo(file2[0]);
            if (sequence == 0) {
                int num1 = Integer.parseInt(file1[1]);
                int num2 = Integer.parseInt(file2[1]);

                return num1 - num2;
            } else {
                return sequence;
            }
        });

        return files;
    }

    private String[] fileArr(String s) {
        String head = "";
        String number = "";
        String tail = "";

        int index = 0;
        for (; index < s.length(); index++) {
            char ch = s.charAt(index);
            if (ch >= '0' && ch <= '9') break;
            head += ch;
        }

        for (; index < s.length(); index++) {
            char ch = s.charAt(index);
            if (!(ch >= '0' && ch <= '9')) break;
            number += ch;
        }

        for (; index < s.length(); index++) {
            char ch = s.charAt(index);
            tail += ch;
        }

        String[] file = {head.toLowerCase(), number, tail};
        return file;
    }
}
