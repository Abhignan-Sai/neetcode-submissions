class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int reqd = -(nums[i]+nums[j]);
                if(set.contains(reqd))
                {
                    List<Integer> level = new ArrayList<>();
                    level.add(nums[i]);
                    level.add(nums[j]);
                    level.add(reqd);
                    if(!res.contains(level))
                    {

                        res.add(level);
                    }
                }
                set.add(nums[j]);
            }
        }
        return res;
        
    }
}
