import java.util.Scanner;
public class task3 {
    //complexity O(sqrt(n))
    public static boolean isprime(int n, int d){
        if (n<2) return false;
        if(d == 1) return true;
        if(n%d==0) return true;
        return isprime(n,d-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isprime(n,(int)Math.sqrt(n)));
    }
}
