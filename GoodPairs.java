public class GoodPairs {
    int numIdenticalPairs(int[] nums){
        int count = 0;
        int n = nums.length;
        for(int i = 0;i<=n-2;i++){
            for(int j = i+1;j<=n-1;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
