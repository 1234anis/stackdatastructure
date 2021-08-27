class Solution {
    public List<Integer> findAnagrams(String s, String p) {
           
       List<Integer> res = new ArrayList<>();
        
        if (p.length()>s.length())return res;
        
        int[] hash = new int[26];
        
        int[] temp=  new int[26];
​
        for (int i = 0; i<p.length(); i++)hash[p.charAt(i)-97]++;
        
        int j = 0, i = 0; 
        
        while (j<s.length()){
            temp[s.charAt(j)-97]++;
            if (j-i==p.length()){
                temp[s.charAt(i)-97]--;
                i++;
            }
            if (Arrays.equals(hash, temp)){
                res.add(Math.abs(p.length()-j-1));
            }
            j++;
        }
        
      return res;   
    }
}
