import java.util.Scanner;
public class task7 {
    //Time Complexity O(n!)
    //Space complexity O(n)
    public static void permutations(char[] arr,int l, int r){
        if (l == r){
            System.out.println(new String(arr));
            return;
        }
        for (int i = l; i <= r; i++){
            swap(arr,l,i);
            permutations(arr,l+1,r);
            swap(arr,l,i);
        }
    }
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        permutations(str.toCharArray(),0,str.length()-1);
    }
}
