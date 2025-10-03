package leetcodes;

import java.util.HashMap;

public class TwoSumSolution {
//    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> numMap = new HashMap<>();
//        
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//            
//            if (numMap.containsKey(complement)) {
//                return new int[] { numMap.get(complement), i };
//            }
//            
//            numMap.put(nums[i], i);
//        }
//        
//        // If no solution is found (though the problem guarantees one)
//        throw new IllegalArgumentException("No two sum solution");
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        int[] result = twoSum(nums, target);
//        
//        System.out.println("[" + result[0] + ", " + result[1] + "]");
//    }
	
	public static void main(String args[]) {
		
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		
		for (int i=0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					System.out.println("Indices: " + i + ", " + j);
				}
			}
		}
	}
}

