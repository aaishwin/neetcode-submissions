class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int sum=0;
            int[] summedarr= Arrays.copyOf(nums,nums.length);
            summedarr[i]=1;
            sum+=Arrays.stream(summedarr).reduce(1,(x,y)->x*y);
            output[i]=sum;
            sum=1;
        }
        
        return output;
    }
}  
