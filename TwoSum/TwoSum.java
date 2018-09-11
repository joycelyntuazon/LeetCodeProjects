class TwoSum{
    public int[] TwoSum(int[] nums, int target){
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length - 1; j++){
                if((nums[i] + nums[j]) == target){
                    int[] array = [i. j];
                }
            }
        }
        int[] array = [-1, -1];
        return array;
    }
    public static void main(String[] args){
        int[] nums = [2, 7, 11, 15];
        int target = 9;
        TwoSum(nums, target);
    }
}