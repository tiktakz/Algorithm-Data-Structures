import java.util.*;

class Main4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n,str));

    }

    public static char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c,map.getOrDefault(c, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key)>max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }
}