package beakjoon_Data_Structure_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BinaryToEight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = s.toCharArray();
        int num = 0;
        Stack<Integer> st = new Stack<>();
        int m = 0;
        for (int i = s.length()-3; i >= 0; i -= 3) {
            m = 0;
            String s2 = s.substring(i, i+3);
            if (s2.charAt(0) == '1') {
                m += 4;
            }
            if (s2.charAt(1) == '1') {
                m += 2;
            }
            if (s2.charAt(2) == '1') {
                m += 1;
            }
            st.push(m);
        }
        m = 0;
        if (s.length() % 3 == 2) {
            if (s.charAt(0) == '1') {
                m += 2;
            }
            if (s.charAt(1) == '1') {
                m += 1;
            }
            st.push(m);
        } else if (s.length() % 3 == 1) {
            if (s.charAt(0) == '1') {
                m += 1;
            }
            st.push(m);
        }
        int size = st.size();
        for (int i = 0; i < size; i++) {
            System.out.print(st.pop());
        }
    }
}
