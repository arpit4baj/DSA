class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> ele = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char ch:s.toCharArray()){
            if(ele.containsKey(ch)){
                ele.put(ch,ele.get(ch)+1);
            }
            else{
                ele.put(ch,1);
            }
        }
        for(char ch:t.toCharArray()){
            if(!ele.containsKey(ch)){
                return false;
            }
            ele.put(ch,ele.get(ch)-1);
            if(ele.get(ch)==0){
                ele.remove(ch);
            }
        }
        return ele.isEmpty();
        
    }
}