import java.util.Scanner;
public class task8 {
    //Complexity O(N)
    public static void checkfors(char[] arr){
        for (char c : arr) {
            if (c == 's') {
                System.out.println("Yes");
                System.exit(0);
            }
        }
        System.out.println("No");

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        checkfors(s.toCharArray());
    }
}
