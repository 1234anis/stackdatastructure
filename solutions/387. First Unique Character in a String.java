class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> charCount = new HashMap<>();
        char[] word = s.toCharArray();
        //count occurences of letter
        for(char letter : word){
            if(charCount.containsKey(letter))
                charCount.put(letter,charCount.get(letter)+1);
            else
                charCount.put(letter,1);
        }
        //return the first letter index with count=1
        for(char letter: word){
            if(charCount.get(letter)==1)
               return s.indexOf(letter+"");  
        }
        return -1;
        
    }
}
