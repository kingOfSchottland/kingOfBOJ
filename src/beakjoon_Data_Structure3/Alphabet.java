package beakjoon_Data_Structure3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        int[] a = new int[26];
        for (char k : c) {
            a[k - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : a) {
            sb.append(i).append(' ');
        }
        System.out.println(sb);
    }
}
