class Solution {
    public int findDuplicate(int[] nums) {
        int slowptr = nums[0];
        int fastptr = nums[0];
        
        do
        {
            slowptr = nums[slowptr];
            fastptr = nums[nums[fastptr]];
        }
        while(slowptr != fastptr);
        
        fastptr = nums[0];
        while(slowptr != fastptr)
        {
            slowptr = nums[slowptr];
            fastptr = nums[fastptr];
        }
        return slowptr;
    }
}
