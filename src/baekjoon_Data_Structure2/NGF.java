package baekjoon_Data_Structure2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

public class NGF {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] num = new int[N];
        int[] ngf = new int[N];
        int[] num2 = new int[N]; // 빈도수를 담을 배열
        Stack<Integer> ngfNum = new Stack<>();
        Stack<Integer> ngfInd = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(st.nextToken());
        }
        Map<Integer, Integer> how = new HashMap<>(); // 해당 값이 몇 번 등장했는지. (값, 빈도수) 맵이 생각났다.
        for (int i = 0; i < N; i++) {
            if (!how.containsKey(num[i])) {
                how.put(num[i], 1);
            } else {
                how.put(num[i], how.get(num[i]) + 1);
            }
        }
        for (int i = 0; i < N; i++) {
            num2[i] = how.get(num[i]); // num배열의 값당 빈도수 저장, 이 다음부턴 그냥 오큰수 찾기.
        }
        for (int i = 0; i < N; i++) { // 오큰수를 찾고 저장하는 루프. 총 N번 반복

            while (!ngfNum.isEmpty() && ngfNum.peek() < num2[i]) { // 스택에 들어있는 수가 현재 값보다 작다면 현재 값이 스택 peek 값의 오큰수.
                ngf[ngfInd.pop()] = num[i]; // 순차적으로 저장한 인덱스를 반환 후 ngf배열에 현재값 저장. (단, 저장하는 값은 빈도수가 아닌 원래 값)
                ngfNum.pop(); // 오큰수를 찾은 값은 스택에서 빼준다.
            }
            ngfInd.push(i); // 현재 값에도 오큰수가 있을테니 스택에 넣어준다.
            ngfNum.push(num2[i]); // 빈도수 값 저장.
        }
        ngf[ngfInd.pop()] = -1; // num배열의 마지막 값은 필연적으로 남을 수 밖에 없으니, -1값을 저장.
        ngfNum.pop();
        while (!ngfNum.isEmpty()) { // 오른쪽 값들 중에 오큰수가 없어서 남겨진 수들은 오큰수가 없으니 -1저장.
            ngf[ngfInd.pop()] = -1;
            ngfNum.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(ngf[i]).append(' ');
        }
        System.out.println(sb);
    }
}
