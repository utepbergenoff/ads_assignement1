import java.util.Scanner;

public class task9 {
    //time complexity O(2^n)
    //space complexity O(n)
    public static int binomial(int n, int k) {
        if (n == 0 || k == 0 || n==k) {
            return 1;
        }
        return binomial(n - 1, k - 1) + binomial(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(binomial(n, k));
    }
}
