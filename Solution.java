public  static class Solution {
    public int hummingWeight(int n){
        int count = 0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
     public static void main(String[] args){
        Solution bit = new Solution();
        int sum = bit.hummingWeight(2147483645);
        System.out.println(sum);
    }