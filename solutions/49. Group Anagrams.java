class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
HashMap<HashMap<Character,Integer>,ArrayList<String>> map = new HashMap<>();
        
        for(String str : strs){
            HashMap<Character,Integer> fmap = new HashMap<>();
            for(int i=0;i<str.length();i++)
                fmap.put(str.charAt(i),fmap.getOrDefault(str.charAt(i),0)+1);
            
            
            if(map.containsKey(fmap)==false){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(fmap,list);
            }
            
            else{
                map.get(fmap).add(str);
            }
                
        }
        
       List<List<String>> ans = new ArrayList<>();
         
         for(ArrayList<String> val : map.values())
             ans.add(val);
        
        return ans;
}
}
