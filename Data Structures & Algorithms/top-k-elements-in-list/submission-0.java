class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        /* add all the values to a hashmap, then add the map entries to a list, sort them*/
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        //create buckets of size n+1
        ArrayList<Integer>[] buckets = new ArrayList[n+1];
        
        // iterate over entry set of the map,
        for(int key: map.keySet())
        {
            int freq = map.get(key);
            // if there exists no list for that freq, that means it is the first entry
            // of that particular bucket, so create a new bucket and add the maps v
            if(buckets[freq]==null)
            {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(key);
        }

        // now iterate from behind, create a res array of size k
        // keep track of the index, when the index reaches k return the res
        int index = 0;
        int[] res = new int[k];
        for(int i=buckets.length-1;i>=0;i--)
        {
            if(buckets[i]!=null)
            {
                for(int m : buckets[i])
                {
                    res[index] = m;
                    index++;
                    if(index==k) return res;
                }
            }
        }
        return res;
        
    }
}
