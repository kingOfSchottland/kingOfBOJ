package baekjoon_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Mass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] M = new int[num];
        int[] H = new int[num];
        int[] K = new int[num];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M[i] = Integer.parseInt(st.nextToken());
            H[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < num; i++) {
            K[i] = 1;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    continue;
                }
                if (M[i] < M[j] && H[i] < H[j]) {
                    K[i]++;
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(K[i] + " ");
        }
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] M = new int[num];
        int[] H = new int[num];
        int[] K = new int[num];
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            M[i] = Integer.parseInt(st.nextToken());
            H[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < num; i++) {
            K[i] = num;
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) {
                    continue;
                }
                if (M[i] < M[j]) {
                    if (H[i] < H[j]) {
                        K[j]--;
                    } else {
                        K[i]--;
                    }
                } else {
                    if (H[i] < H[j]) {
                        K[i]--;
                    } else {
                        continue;
                    }
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(K[i] + " ");
        }

         */
    }
}
