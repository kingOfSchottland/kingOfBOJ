import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Print {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BigInteger k = new BigInteger(String.valueOf(2));
        for (int i = 3; i <= N; i++) {
            k = new BigInteger(String.valueOf(lcm(k, BigInteger.valueOf(i))));
        }
        System.out.println((k.mod(BigInteger.valueOf((long) Math.pow(2, 32)))));
    }
    static BigInteger gcd(BigInteger m, BigInteger n) {
        BigInteger c;
        while (!n.equals(new BigInteger("0"))) {
            c = new BigInteger(String.valueOf(m.mod(n)));
            m = n;
            n = c;
        }
        return m;
    }
    static BigInteger lcm(BigInteger m, BigInteger n) {
        return m.multiply(n).divide(gcd(m,n));
    }
}

