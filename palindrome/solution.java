public class solution {

    private static boolean checkPalindrome(String num) {
        int left = 0;
        int right = num.length() - 1;

        while (left < right) {
            if (num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String num = x + ""; // convert to string
        return checkPalindrome(num);
    }

    // LeetCode-style test runner
    public static void main(String[] args) {
        solution sol = new solution();

        runTest(sol, 121);
        runTest(sol, -121);
        runTest(sol, 10);
        runTest(sol, 0);
        runTest(sol, 12321);
    }

    // helper tester
    private static void runTest(solution sol, int input) {
        System.out.println("Input: " + input);
        boolean ans = sol.isPalindrome(input);
        System.out.println("Output: " + ans);
        System.out.println("-------------------------");
    }
}