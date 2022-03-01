package baekjoon;

import java.util.Scanner;

public class BeesHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tmp = 1; //경계선 값
        int room = 1; //방 개수
        for (int i = 1; tmp < num; i++) { //num이 경계선 값보다 크면 방 개수 추가
            room++;
            tmp += 6*i; //경계선 값은 육각형이기 때문에 6의 배수씩 증가
        }
        if (room == 1) {
            System.out.println(1);
        } else {
            System.out.println(room);
        }
    }
}