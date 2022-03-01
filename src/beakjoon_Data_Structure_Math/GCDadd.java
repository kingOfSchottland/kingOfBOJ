package beakjoon_Data_Structure_Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GCDadd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long num = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> al = new ArrayList();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            num = 0;
            al.clear();
            int o = Integer.parseInt(st.nextToken());
            for (int i = 0; i < o; i++) {
                al.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(al, (i1, i2) -> i2-i1);
            for (int i = 0; i < al.size(); i++) {
                for (int j = i+1; j < al.size(); j++) {
                    num += gcd(al.get(i), al.get(j));
                }
            }
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }

    static int gcd (int m, int n) {
        if (n == 0) {
            return m;
        }
        return gcd(n, m%n);
    }
}
