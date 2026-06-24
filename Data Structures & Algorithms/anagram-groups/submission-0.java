class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> result= new HashMap<>();
        for(String s:strs){
            char[] str= s.toCharArray();
            Arrays.sort(str,0,str.length);
            result.computeIfAbsent(Arrays.toString(str),x->new ArrayList<>()).add(s);

        }
        List<List<String>> anagrams= new ArrayList<>(result.values());
        return anagrams;
        
    }
}
