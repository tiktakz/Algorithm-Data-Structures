package inflearnv2;
import java.util.*;

class Inf0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i ++) arr[i] = sc.nextInt();

        int[] cache = new int[n];

        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < cache.length; i++) {
                if (cache[i] == x) pos = i;
            }
            // cache에 존재하지 않음
            if (pos == -1) {
                for (int i = n - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else {
                for (int i = pos; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
                cache[0] = x;
            }
        }

        for (int i : cache) System.out.print(cache + " ");
    }
}
