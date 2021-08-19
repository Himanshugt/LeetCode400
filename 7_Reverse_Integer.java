
/*
    Problem Link: https://leetcode.com/problems/reverse-integer/submissions/
*/

class Solution {
    public int reverse(int x) {
        
        /*
        
        If the number is large such that the reverse overflows.
        How to handle overflow? 
        The idea is to store previous value of the sum can be stored in a variable which can be checked every time to see if the reverse overflowed or not.
        
        */


        int prev_rev_num = 0, rev_num = 0;
        while (x != 0)
        {
            int curr_digit = x%10;
      
            rev_num = (rev_num*10) + curr_digit;
      
            // checking if the reverse overflowed or not.
            // The values of (rev_num - curr_digit)/10 and
            // prev_rev_num must be same if there was no
            // problem.
            if ((rev_num - curr_digit)/10 != prev_rev_num)
            {
                return 0;
            }
      
            prev_rev_num = rev_num;
            x = x/10;
        }

        return rev_num;
    }
}