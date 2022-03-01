package baekjoon_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] N_n = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            N_n[i] = Integer.parseInt(st.nextToken());
        }
        int tmp = 0;
        int index = 0;
        for (int i = 1; i < N; i++) {
            index = i;
            for (int j = i-1; j >= 0; j--) {
                if (N_n[index] < N_n[j]) {
                    tmp = N_n[index];
                    N_n[index] = N_n[j];
                    N_n[j] = tmp;
                    index = j;
                }
            }
        }
        index = 0;
        for (int i = 0; i < N-2; i++) {
            for (int j = i+1; j < N-1; j++) {
                for (int k = j+1; k < N; k++) {
                    tmp = N_n[i] + N_n[j] + N_n[k];

                    if (M == tmp) {
                        System.out.println(tmp);
                        System.exit(0);
                    }

                    if (index < tmp && tmp < M) {
                        index = tmp;
                    }
                }
            }
        }
        System.out.println(index);
    }
}