// Problem Link: https://leetcode.com/problems/two-sum/

/*
The idea behind this is that we iterate over the array and for each element we check that if (target-number)
doesn't exists in the map. If it exists, then it means that the sum of ith number and the number found in map
will give the target sum. If it doesn't exists we add the number to the map along with its index.
T.C.- O(n)
S.C.- O(n)
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;++i){
            if(map.containsKey(target-nums[i])){
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i);
        }
        
        return result;
    }
}
