class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqs= new HashMap<>();
        for(int i:nums){
            freqs.put(i,freqs.getOrDefault(i,0)+1);
        }

       ArrayList<Integer> n= new ArrayList<>(freqs.keySet());
       Collections.sort(n,(x,y)->Integer.compare(freqs.get(y),freqs.get(x)));
       int[] result=n.stream().mapToInt(i->i).toArray();

        return Arrays.copyOfRange(result,0,k);
    }
}
