package beakjoon_Data_Structure3;

import java.io.*;

public class ROT13 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] c = br.readLine().toCharArray();
        for (char k : c) {
            if (k == ' ' || (k >= '0' && k <= '9')) {
                bw.write(k);
                bw.flush();
                continue;
            }
            if (k >= 'a' && k <= 'z') {
                if (k + 13 > 'z') {
                    bw.write(k-13);
                    bw.flush();
                } else {
                    bw.write(k+13);
                    bw.flush();
                }
            } else if (k >= 'A' && k <= 'Z') {
                if (k + 13 > 'Z') {
                    bw.write(k-13);
                    bw.flush();
                } else {
                    bw.write(k+13);
                    bw.flush();
                }
            }
        }
    }
}
