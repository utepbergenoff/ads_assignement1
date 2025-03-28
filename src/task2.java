import java.util.Scanner;
public class task2 {
    //Complexity O(n) linear for all functions
    public static int sum(int[] arr, int n) {
        if (n==1) return arr[0];
        return arr[n-1]+sum(arr,n-1);
    }

    public static double average(int[] arr, int n) {
        if(n==0){
            return 0;
        }
        int totalsum = sum(arr,n);
        return (double) totalsum/n;

    }
    //Complexity O(n) linear
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double average = average(arr,n);
        System.out.println(average);
    }
}
