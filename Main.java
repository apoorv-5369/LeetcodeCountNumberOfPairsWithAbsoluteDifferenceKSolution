// using Brute Force.
class Solution {
    public int absoluteValue(int a, int b){
        int sum=a-b;
        if(sum>=0) return sum;
        else return -sum;
    }
    public int countKDifference(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(absoluteValue(nums[i], nums[j])==k) count++;
            }
        }
        return count;
    }
}

// using HashMap.
class Solution {

    public int countKDifference(int[] nums, int k) {
        int count=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i:nums){
            hm.put(i, hm.getOrDefault(i, 0)+1);
            count+=hm.getOrDefault(i-k, 0)+hm.getOrDefault(i+k, 0);
        }
        return count;
    }
}
