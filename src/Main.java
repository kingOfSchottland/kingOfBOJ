import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        int[] arrm = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrm.length; i++) {
            arrm[i] = Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        for (int i : arrm) {
            if (binary(i, arr)) {
                sb.append('1').append('\n');
            } else {
                sb.append('0').append('\n');
            }
        }
        System.out.println(sb);
    }
    static boolean binary(int k, int[] arr) {
        int lef = 0;
        int rig = arr.length-1;
        int target = (lef+rig)/2;
        while (lef <= rig) {
            if (k < arr[target]) {
                rig = target-1;
                target = (lef + rig) / 2;
            } else if (k > arr[target]) {
                lef = target+1;
                target = (lef + rig) / 2;
            } else {
                return true;
            }
        }
        return false;
    }
}
