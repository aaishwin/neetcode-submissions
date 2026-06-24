class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> result= new HashSet<Integer>();
        for(int i:nums){
            result.add(i);
        }
        return (nums.length!=result.size());
        
    }
}