class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int firstLen = strs[0].length();
        StringBuilder sb = new StringBuilder();
        // char ch = strs[0].charAt(0);
        int index = 0;
        for(int i=0;i<firstLen;i++)
        {
            char ch = strs[0].charAt(i);
            for(String str : strs)
            {
                if(i==str.length() || str.charAt(i)!=ch)
                {
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
        
    }
}