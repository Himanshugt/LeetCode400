// Problem link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

/*
 * The idea behind this is we maintain a pointer i and we start iterating the loop from the
 * start and as soon as we get an element greater than the (i-1)th index element{Because we
 * have initialized i as 1} we set this element as at the ith index element and move the i
 * pointer ahead.
 * So basically what we are doing is as we move ahead onto the array we eliminate the numbers
 * which are equal to previous set number and only fix numbers into array that we need(We do this by the
 * help of the i pointer).
 */

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
