package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bunier {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] correct = new int[num];
        for (int i = 0; i < num; i++) {
            int K = Integer.parseInt(br.readLine());
            int N = Integer.parseInt(br.readLine());
            int[][] apart = new int[K+1][N];
            for (int j = 0; j < N; j++) {
                apart[0][j] = j+1;
            }
            for (int j = 1; j < apart.length; j++) {
                for (int l = 0; l < apart[0].length; l++) {
                    for (int h = 0; h < l+1; h++) {
                        apart[j][l] += apart[j-1][h];
                    }
                }
            }
            correct[i] = apart[K][N-1];
        }
        for (int i = 0; i < num; i++) {
            System.out.println(correct[i]);
        }
    }
}
