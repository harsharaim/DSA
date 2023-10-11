// Brute-force approach
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            int req=target-nums[i];
            for(int j=i+1;j<nums.length;j++){
                 if(nums[j]==req) return new int[]{i,j};
            }
        }
        return null;
    }
}

// solution using HashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
   Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int req=target-nums[i];
            if(map.containsKey(req)){
                return new int[] {map.get(req),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
