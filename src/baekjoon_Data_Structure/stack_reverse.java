package baekjoon_Data_Structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack_reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Stack<Character> st = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String s = br.readLine() + " ";
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == ' ') {
                    while (!st.isEmpty()) {
                        sb.append(st.pop());
                    }
                    sb.append(' ');
                } else {
                    st.push(s.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
