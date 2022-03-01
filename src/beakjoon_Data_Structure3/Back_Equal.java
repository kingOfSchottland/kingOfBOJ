package beakjoon_Data_Structure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back_Equal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> st = new Stack<>();
        boolean b = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    sb.append(st.pop());
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(c)) {
                    sb.append(st.pop());
                }
                st.push(c);
            }
        }
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        System.out.println(sb);

    }
    public static int precedence(char op) {
        if(op == '*' || op == '/') return 2;
        else if(op == '+' || op == '-') return 1;
        else return 0; //스택 안에는 '('도 들어올 수 있다. 하지만 '('는 꺼내져서는 안되기 때문에 제일 낮은 값을 반환하도록 한다.
    }
}
