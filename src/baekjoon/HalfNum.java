package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalfNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int tmp = 1;
        int top = 0;
        int bunmo = 0;
        int bunza = 0;
        int op = 0;
        if (num == 1) { //num이 1일땐 그냥 출력후 종료.
            System.out.println("1/1");
            System.exit(0);
        } else {
            for (int i = 2; tmp < num; i++) {
                op = tmp; //직전까지 대각선들 성분의 합
                tmp += i; //경계선 값을 갱신
                top = i; //num이 속한 대각선 성분의 개수
            }
            if (top % 2 == 1) { //대각선 성분 개수가 홀수면 분모가 커지고 분자가 작아지는
                bunmo = 1;
                bunza = top;
                for (int i = 1; i < num - op; i++) { //연산 실행횟수 = num - 직전 대각선의 합
                    bunmo++;
                    bunza--;
                }
            } else { //대각선 성분 개수가 짝수면 그 반대로
                bunmo = top;
                bunza = 1;
                for (int i = 1; i < num - op; i++) {
                    bunmo--;
                    bunza++;
                }
            }
        }
        System.out.printf("%d/%d", bunza, bunmo);
    }
}
