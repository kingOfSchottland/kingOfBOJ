package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Statistic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] n = new int[N];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(n);
        double sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        double aver = sum/n.length;
        int ave = (int) Math.round(aver);
        int cen = n[n.length/2];
        int range = n[n.length-1] - n[0];
        int[] op = new int[n.length];
        int count = 0;
        int max = 0;
        for (int i = 0; i < op.length; i += count) {
            count = 0;
            for (int j = i; j < op.length; j++) {
                if (n[i] != n[j]) {
                    op[i] = count;
                    break;
                }
                count++;
                op[i] = count;
            }
            if (max < op[i]) {
                max = op[i];
            }
        }
        int index = 0;
        int tm = 0;
        for (int i = 0; i < op.length; i++) {
            if (op[i] == max) {
                index = i;
                tm++;
                if (tm == 2) {
                    break;
                }
            }
        }
        tm = n[index];
        StringBuilder sb = new StringBuilder();
        sb.append(ave).append("\n").append(cen).append("\n").append(tm).append("\n").append(range);
        System.out.print(sb);
    }
}