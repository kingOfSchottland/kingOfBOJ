package baekjoon_bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        String[][] chess = new String[8][8];
        String[][] che = new String[M][N];
        String[][] CHESS1 = new String[8][8];
        String[][] CHESS2 = new String[8][8];
        int[] coun = new int[(M - 7) * (N - 7)];
        int ind = 0;
        for (int i = 0; i < che.length; i++) {
            String[] s = br.readLine().split("");
            for (int j = 0; j < che[0].length; j++) {
                che[i][j] = s[j];
            }
        }
        for (int i = 0; i < CHESS1.length; i++) {
            for (int j = 0; j < CHESS1[0].length; j++) {
                if (i%2==0) {
                    if (j%2==0) {
                        CHESS1[i][j] = "W";
                    } else {
                        CHESS1[i][j] = "B";
                    }
                } else {
                    if (j%2==0) {
                        CHESS1[i][j] = "B";
                    } else {
                        CHESS1[i][j] = "W";
                    }
                }
            }
        }
        for (int i = 0; i < CHESS2.length; i++) {
            for (int j = 0; j < CHESS2[0].length; j++) {
                if (i%2==0) {
                    if (j%2==0) {
                        CHESS2[i][j] = "B";
                    } else {
                        CHESS2[i][j] = "W";
                    }
                } else {
                    if (j%2==0) {
                        CHESS2[i][j] = "W";
                    } else {
                        CHESS2[i][j] = "B";
                    }
                }
            }
        }
        for (int i = 0; i < M-7; i++) {
            for (int j = 0; j < N-7; j++) {
                for (int k = 0; k < chess.length; k++) {
                    for (int l = 0; l < chess[0].length; l++) {
                        chess[k][l] = che[i + k][j + l];
                    }
                }
                int count1 = 0;
                int count2 = 0;
                for (int k = 0; k < chess.length; k++) {
                    for (int l = 0; l < chess[0].length; l++) {
                        if (!chess[k][l].equals(CHESS1[k][l])) {
                            count1++;
                        }
                    }
                }
                for (int k = 0; k < chess.length; k++) {
                    for (int l = 0; l < chess[0].length; l++) {
                        if (!chess[k][l].equals(CHESS2[k][l])) {
                            count2++;
                        }
                    }
                }
                coun[ind] = Math.min(count1, count2);
                ind++;
            }
        }
        int min = coun[0];
        for (int i = 1; i < coun.length; i++) {
            if (coun[i] < min) {
                min = coun[i];
            }
        }
        System.out.println(min);
    }
}
//둘 중 하나를 선택해야하는 경우에는 boolean배열을 쓰는 게 효율적이다.