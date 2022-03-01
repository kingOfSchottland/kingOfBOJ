package baekjoon_Data_Structure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PipeLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        boolean b = false;
        int num = 0;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                st.push(c[i]);
                b = true;
            } else {
                st.pop();
                if (b) {
                    num += st.size();
                } else {
                    num += 1;
                }
                b = false;
            }
        }
        System.out.println(num);
    }
}
