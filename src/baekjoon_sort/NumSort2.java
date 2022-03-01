package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumSort2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] in = new int[num];
        for (int i = 0; i < in.length; i++) {
            in[i] = Integer.parseInt(br.readLine());
        }
        int tmp = 0;
        int index = 0;
        for (int i = 1; i < in.length; i++) {
            index = i;
            for (int j = i-1; j >= 0; j--) {
                if (in[index] < in[j]) {
                    tmp = in[index];
                    in[index] = in[j];
                    in[j] = tmp;
                    index = j;
                }
            }
        }
        for (int i = 0; i < in.length; i++) {
            System.out.println(in[i]);
        }
    }
}
