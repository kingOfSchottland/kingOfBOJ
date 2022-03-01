package baekjoon_Data_Structure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class FlipWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine()+' ';
        boolean b = false;
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '<') {
                while (!st.isEmpty()) {
                    sb.append(st.pop());
                }
                b = true;
                sb.append(c);
                continue;
            } else if (c == '>') {
                b = false;
                sb.append(c);
                continue;
            }
            if (!b) {
                if (c == ' ') {
                    while (!st.isEmpty()) {
                        sb.append(st.pop());
                    }
                    sb.append(c);
                } else {
                    st.push(c);
                }
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
