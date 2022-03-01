package beakjoon_Data_Structure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Equal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] c = br.readLine().toCharArray();
        Stack<Double> st = new Stack<>();
        double[] n = new double[N];
        for (int i = 0; i < n.length; i++) {
            n[i] = Double.parseDouble(br.readLine());
        }
        double answer = 0;
        for (int i = 0; i < c.length; i++) {
            char code = c[i];
            if (c[i] >= 42 && c[i] <= 47) {
                Double num = st.pop();
                Double num2 = st.pop();
                answer = 0.0;
                switch (code) {
                    case '+':
                        answer = num2 + num;
                        break;
                    case '-':
                        answer = num2 - num;
                        break;
                    case '*':
                        answer = num2 * num;
                        break;
                    case '/':
                        answer = num2 / num;
                        break;
                }
                st.push(answer);
            } else {
                st.push(n[code - 'A']);
            }
        }
        System.out.printf("%.2f", st.pop());
    }
}
