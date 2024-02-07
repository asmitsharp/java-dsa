public class Median {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        median(nums1, nums2);
    }

    static void median(int[] nums1, int[] nums2) {
        double sum1 = 0;
        double sum2 = 0;
        int n1 = nums1.length ;
        int n2 = nums2.length ;
        for(int i = 0; i <= n1 - 1; i++) {
            sum1 += nums1[i];
        }
        for(int i = 0; i <= n2 - 1; i++) {
            sum2 += nums2[i];
        }

        double median = (sum1 + sum2) / (n1 + n2);
        System.out.println(median);
    }
}
