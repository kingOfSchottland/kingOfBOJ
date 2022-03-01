package beakjoon_Data_Structure3;

import java.io.*;

public class Analist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = "";
        while ((input = br.readLine()) != null) {
            char[] c = input.toCharArray();
            int[] n = new int[4];
            for (char k : c) {
                if (k >= 'A' && k <= 'Z') {
                    n[1]++;
                } else if (k >= 'a' && k <= 'z') {
                    n[0]++;
                } else if (k >= '0' && k <= '9') {
                    n[2]++;
                } else {
                    n[3]++;
                }
            }
            for (int i : n) {
                bw.write(i + " ");
            }
            bw.write('\n');

            bw.flush();
        }
    }
}
