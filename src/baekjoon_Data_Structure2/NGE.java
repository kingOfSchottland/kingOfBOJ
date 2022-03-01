package baekjoon_Data_Structure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class NGE {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int[] nge = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Stack<Integer> ngeNum = new Stack<>(); // 오큰수를 찾는 수들
        Stack<Integer> ngeInd = new Stack<>(); // 오큰수를 찾는 수들의 인덱스

        for (int i = 0; i < N; i++) { // 오큰수를 찾고 저장하는 루프. 총 N번 반복

            while (!ngeNum.isEmpty() && ngeNum.peek() < num[i]) { // 스택에 들어있는 수가 현재 값보다 작다면 현재 값이 스택 peek 값의 오큰수.
                nge[ngeInd.pop()] = num[i]; // 순차적으로 저장한 인덱스를 반환 후 nge배열에 현재값 저장.
                ngeNum.pop(); // 오큰수를 찾은 값은 스택에서 빼준다.
            }
            ngeInd.push(i); // 현재 값에도 오큰수가 있을테니 스택에 넣어준다.
            ngeNum.push(num[i]);
        }
        nge[ngeInd.pop()] = -1; // num배열의 마지막 값은 필연적으로 남을 수 밖에 없으니, -1값을 저장.
        ngeNum.pop();
        while (!ngeNum.isEmpty()) { // 오른쪽 값들 중에 오큰수가 없어서 남겨진 수들은 오큰수가 없으니 -1저장.
            nge[ngeInd.pop()] = -1;
            ngeNum.pop();
        }
        for (int i = 0; i < nge.length; i++) {
            sb.append(nge[i]).append(' ');
        }
        System.out.println(sb);
    }
}
// 포인트1 : 정수배열에 현재값의 오큰수를 구하는 방법은 for문을 두 번 써야하니 시간초과. -> 생각을 뒤집어 현재값이 오큰수가 되는 정수배열안 값들을 찾는다.(Stack이 생각난다. -> 후입선출)
// 포인트2 : 해당 값 바로 오른쪽에 오큰수가 없다면 바로 오른쪽 값의 오큰수를 찾아야한다. 그 값이 해당 값의 오큰수일 확률이 높기 때문.
// 포인트3 : 오큰수가 없는 값들을 처리하기 위해 인덱스 값을 저장할 스택을 하나 더 만들어야 한다.