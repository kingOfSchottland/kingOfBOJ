package baekjoon_math2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessOfGoldBahh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] correct = new String[num];
        for (int i = 0; i < num; i++) {
            int even = Integer.parseInt(br.readLine());
            int evenary = even;
            int count = 0;
            int[] kol = primeConduct(even, count);
            correct[i] = pack(even, evenary, kol);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(correct[i]);
        }
    }

    static String pack(int even, int evenary, int[] kol) {
        String s = "";
        for (int j = 0; j < kol.length; j++) {
            evenary -= kol[j];
            if (evenary > kol[j]) {
                break;
            } else if (evenary == kol[j]) {
                s = String.format("%d %d", kol[j], kol[j]);
                break;
            } else {
                for (int k = j+1; k < kol.length; k++) {
                    if (evenary == kol[k]) {
                        s = String.format("%d %d", kol[k], kol[j]);
                        break;
                    }
                }
            }
            evenary = even;
        }
        return s;
    }

    static int[] primeConduct(int even, int count) {
        boolean[] isPrime = new boolean[even];
        isPrime[0] = true;
        isPrime[1] = true;
        for (int j = 2; j <= Math.sqrt(even); j++) {
            if (isPrime[j]) {
                continue;
            }
            for (int k = j * j; k < isPrime.length; k += j) {
                isPrime[k] = true;
            }
        }
        for (int j = 0; j < isPrime.length; j++) {
            if (!isPrime[j]) {
                count++;
            }
        }
        int[] op = new int[count];
        int hi = 0;
        for (int j = isPrime.length-1; j >= 0; j--) {
            if (!isPrime[j]) {
                op[hi] = j;
                hi++;
            }
        }
        return op;
    }
}
