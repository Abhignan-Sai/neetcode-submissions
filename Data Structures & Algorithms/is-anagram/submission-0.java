class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if(sLen!=tLen) return false;
        int a[] = new int[26];
        int b[] = new int[26];
        for(int i=0;i<sLen;i++)
        {
            char sh = s.charAt(i);
            char th = t.charAt(i);
            a[sh-'a']++;
            b[th-'a']++;
        }
        return (Arrays.equals(a,b));
        

    }
}
