public class runningSum {
    int[] RunningSum(int[] nums){
        int n = nums.length;
        for(int i = 1;i<=n-1;i++){
            nums[i] = nums[i] + nums[n-1];
        }
        return nums;
    } 
}
