import java.util.Arrays;

//Problem Link: https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] indexes = new int[nums.length];
        
        //HashMap<Integer,Integer> indexes=new HashMap<Integer,String>();   
        
        for(int i=0; i<nums.length; i++){
            indexes[i] = nums[i];
        }
        
        Arrays.sort(nums);
                                
        int[] ans = new int[2];
        
        for(int i=0, j=nums.length-1; i<nums.length-1 && j>0;  ){
            if(nums[i] + nums[j] == target){
                
                return FindIndex(indexes, nums[i], nums[j]);
            }
            
            else if (nums[i] + nums[j] > target){
                j--;
            }
            
            else if (nums[i] + nums[j] < target){
                i++;
            }
        }
        
        return ans;
    }
    
    public int[] FindIndex(int[] indexes, int target1, int target2){
        int[] ans = new int[2];
        int f1=0,f2=0;
        
        for(int i=0, j=indexes.length-1; i<indexes.length || j>=0; ){
            if(indexes[i] == target1){
                ans[0] = i;
                f1=1;
            }
            
            else{
                i++;
            }
            
            if(indexes[j] == target2){
                ans[1] = j;
                f2=1;
            }
            
            else{
                j--;
            }
            
            if(f1 == 1 && f2 == 1){
                return ans;
            }
        }
        
        return ans;
    }
    
}