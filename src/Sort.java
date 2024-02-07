import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int arr[] = {12, 34, 11, 22, 5};
        //bsort(arr, arr.length - 1, 0);
        ssort(arr, arr.length ,0, 0 );
        System.out.println(Arrays.toString(arr));
    }

    static void bsort(int[] arr, int r, int c) {
        if( r == 0 ) {
            return;
        }
        if(c < r) {
            if(arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bsort(arr, r, c + 1);
        } else {
            bsort(arr, r - 1, 0);
        }
    }

    static void ssort(int[] arr, int r, int c, int max) {
        if( r == 0 ) {
            return;
        }
        if(c < r) {
            if(arr[c] > arr[max]) {
                ssort(arr, r, c + 1, c);
            } else {
                ssort(arr, r, c + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            ssort(arr, r - 1, 0, 0);
        }
    }
}