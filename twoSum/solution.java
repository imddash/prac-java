import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class solution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No match");
    }
    // LeetCode-style test runner
    public static void main(String[] args) {
        solution sol = new solution();

        runTest(sol, new int[]{2,7,11,15}, 9);
        runTest(sol, new int[]{3,2,4}, 6);
        runTest(sol, new int[]{3,3}, 6);
    }

    // helper tester
    private static void runTest(solution sol, int[] nums, int target){
        System.out.println("Input: " + Arrays.toString(nums) + " | target=" + target);
        int[] ans = sol.twoSum(nums, target);
        System.out.println("Output: " + Arrays.toString(ans));
        System.out.println("-------------------------");
    }
}

// I’m practicing Java DSA problems locally in VSCode. I use a reusable template with a main method and test helper to simulate LeetCode-style testing. I want help debugging, improving, or optimizing my Java solutions. Assume I compile and run from terminal with correct package structure. Continue assisting me in this workflow.
