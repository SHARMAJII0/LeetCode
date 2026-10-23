class Solution {
    public int majorityElement(int[] nums) {
        int candi = 0;
        int count = 0;

        for(int n : nums){
            if(count == 0){
                candi = n;
            }
            if(n == candi){
                count++;
            }
            else{
                count--;
            }
        }
        return candi;
    }
}