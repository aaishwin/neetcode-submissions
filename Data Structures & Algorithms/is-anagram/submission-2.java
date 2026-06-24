class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> schars= new HashMap<>();
        HashMap<Character,Integer> tchars= new HashMap<>();
        for(char c:s.toCharArray()){
            schars.put(c,schars.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            tchars.put(c,tchars.getOrDefault(c,0)+1);
        }
        return(schars.equals(tchars));


    }
}
