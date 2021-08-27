class Solution {
   
    public boolean isAnagram(String s, String t) 
    {
        return convert(s).equals(convert(t));
    }
    
    public String convert(String str)
    {
        char[] strArray = str.toCharArray();
        Arrays.sort(strArray);
        return new String(strArray);
    }
}
