package baekjoon_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LocationCondence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] fir = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < fir.length; i++) {
            fir[i] = Integer.parseInt(st.nextToken());
        }
        int[] sec = Arrays.copyOf(fir, fir.length);
        Arrays.sort(sec);
        Map<Integer, Integer> list = new HashMap<Integer, Integer>();
        int count = 1;
        list.put(sec[0], 0);
        for (int i = 1; i < fir.length; i++) {
            if (sec[i] != sec[i-1]) {
                list.put(sec[i], count);
                count++;
            }
        }
        int[] thi = new int[N];
        for (int i = 0; i < fir.length; i++) {
            thi[i] = list.get(fir[i]);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sec.length; i++) {
            sb.append(thi[i]).append(' ');
        }
        System.out.println(sb);
    }
}
