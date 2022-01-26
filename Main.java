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
