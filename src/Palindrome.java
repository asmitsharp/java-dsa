public class Palindrome {

//    static int rev(int n) {
//        int digits = (int)(Math.log10(n)) + 1;
//        return helper(n, digits);
//    }
//
//    public static int helper(int n, int digits) {
//        if(n % 10 == n) {
//            return n;
//        }
//
//        int rem  = n % 10;
//        return rem + (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
//    }

    public static void main(String[] args) {
//        System.out.println(palingNum(1234321));
        System.out.println(checkZero(302401));
    }

//    static boolean palingNum(int n) {
//        return n == rev(n);
//    }

    public static int checkZero(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if(n == 0) {
            return c;
        }

        int rem  = n % 10;
        if(rem == 0) {
            return helper(n/10, c + 1);
        }
        return helper(n/10, c);
    }
}
