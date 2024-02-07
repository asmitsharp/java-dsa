import java.util.ArrayList;

public class RecArray {
    public static void main(String[] args) {
        int[] arr = {1,22,3,4,4,5,6};
        //System.out.println(sorted(arr,0));
        //System.out.println(linearSearch(arr,7,0));

        //ArrayList<Integer> ans = findAllIdx(arr,4,0, new ArrayList<>());
        //System.out.println(ans);
        System.out.println(findAllIdx2(arr,4,0));
    }

    static boolean sorted(int arr[], int idx) {
        if(idx == arr.length - 1) {
            return true;
        }

        return arr[idx] < arr[idx + 1] && sorted(arr, idx + 1);
    }

    static int linearSearch(int arr[],int target, int idx) {
        if(idx == arr.length) {
            return -1;
        }

        if(arr[idx] == target) {
            return idx;
        }
        return linearSearch(arr,target,idx + 1);
    }

    static ArrayList<Integer> list  = new ArrayList<>();
     void findAll(int arr[],int target, int idx) {
        if(idx == arr.length) {
            list.add(-1);
        }

        if(arr[idx] == target) {
            list.add(idx);
        }
       linearSearch(arr,target,idx + 1);
    }

    static ArrayList findAllIdx(int arr[],int target, int idx, ArrayList<Integer> list) {
        if(idx == arr.length) {
            return list;
        }

        if(arr[idx] == target) {
            list.add(idx);
        }
        return findAllIdx(arr,target,idx + 1, list);
    }

    static ArrayList findAllIdx2(int arr[],int target, int idx) {

         ArrayList<Integer> listV = new ArrayList<>();

        if(idx == arr.length) {
            return listV;
        }

        if(arr[idx] == target) {
            listV.add(idx);
        }
        ArrayList<Integer> ansFromBelow =  findAllIdx2(arr,target,idx + 1);

        listV.addAll(ansFromBelow);

        return listV;
    }


}
