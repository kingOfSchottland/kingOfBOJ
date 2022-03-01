package baekjoon_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SplitAdd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int nl = Integer.parseInt(n);
        int correct = 0;
        for (int i = 1; i < nl; i++) {
            int l = i;
            int tmp = 0;
            while (l != 0) {
                tmp += l%10;
                l /= 10;
            }
            if (i + tmp == nl) {
                correct = i;
                break;
            }
        }
        System.out.println(correct);
    }
}
