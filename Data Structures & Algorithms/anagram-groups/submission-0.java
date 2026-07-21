class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs)
        {
            int[] freq = new int[26];
            for(char c : s.toCharArray())
            {
                freq[c-'a']++;
            }
            /* very very important, Arrays.toString() converts the Array to a string, so that
            string becomes our key of the hashmap */
            String key = Arrays.toString(freq);
            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}
