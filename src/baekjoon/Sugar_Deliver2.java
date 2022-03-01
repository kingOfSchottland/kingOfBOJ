package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sugar_Deliver2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int kilo = Integer.parseInt(br.readLine());
        int correct = 0;
        if (kilo % 5 == 0) {
            correct = kilo / 5;
        } else {
            int i = kilo / 5;
            int isholy = 0;
            while (true) {
                isholy = kilo - 5 * i;
                if (isholy % 3 == 0) {
                    correct = i + isholy/3;
                    System.out.println(correct);
                    System.exit(0);
                } else if (i <= 0) {
                    correct = -1;
                    break;
                }
                i--;
            }
        }
        System.out.println(correct);
    }
}
