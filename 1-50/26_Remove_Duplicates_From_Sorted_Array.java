// Problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
        
        int i=1;
        for (int n : nums){
            if (n > nums[i-1]){
                nums[i] = n;
                ++i;
            }   
        }
           
        return i;
    }
}

/*
 * Helper Discussion: 
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/discuss/11780/5-lines-C%2B%2BJava-nicer-loops
 */
