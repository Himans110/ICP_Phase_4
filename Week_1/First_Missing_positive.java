package practice;
import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(find(arr));
    }
    public static int find(int arr[]){
        // check 1 is present or not in array and change value of array to 1 if not in range [1 - n]
        int n = arr.length;
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if(arr[i] == 1) flag = true;
            if (arr[i] <= 0 || arr[i] > n) arr[i] = 1;
        }
        if(!flag) return 1;
        for (int i = 0; i < n; i++) {
            int idx = Math.abs(arr[i]) - 1;
            if (arr[idx] > 0)
                arr[idx] = -arr[idx];
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0)
                return i + 1;
        }
        return n + 1;
    }
}
