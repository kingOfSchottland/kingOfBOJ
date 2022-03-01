package baekjoon_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            char[][] Hon = setHon(N);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < Hon.length; i++) {
                for (int j = 0; j < Hon[0].length - 1; j++) {
                    sb.append(Hon[i][j]).append(' ').append(Hon[i][j + 1]);
                }
                sb.append("\n");
            }
            System.out.println(Hon.length);
            System.out.println(sb);
        }

        static char[][] setHon(int n) {
            if (n == 1) {
                char[][] hon = {{'1', '3'}};
                return hon;
            }
            char[][] con = setHon(n-1);
            char[][] hon = new char[2 * con.length + 1][2];
            boolean jump = false;
            int count = 0;
            for (int i = 0; i < hon.length; i++) {
                if (!jump) {
                    count++;
                    if (con[i][0] == '2') {
                        hon[i][0] = '3';
                    } else if (con[i][0] == '3') {
                        hon[i][0] = '2';
                    } else {
                        hon[i][0] = '1';
                    }
                    if (con[i][1] == '2') {
                        hon[i][1] = '3';
                    } else if (con[i][1] == '3') {
                        hon[i][1] = '2';
                    } else {
                        hon[i][1] = '1';
                    }
                    if (count == con.length) {
                        jump = true;
                        i++;
                        hon[i][0] = '1';
                        hon[i][1] = '3';
                    }
                } else {
                    for (int j = 0; j < con.length; j++) {
                        if (con[j][0] == '1') {
                            hon[i + j][0] = '2';
                        } else if (con[j][0] == '2') {
                            hon[i + j][0] = '1';
                        } else {
                            hon[i + j][0] = '3';
                        }
                        if (con[j][1] == '1') {
                            hon[i + j][1] = '2';
                        } else if (con[j][1] == '2') {
                            hon[i + j][1] = '1';
                        } else {
                            hon[i + j][1] = '3';
                        }
                    }
                    break;
                }
            }
            return hon;
        }
}

