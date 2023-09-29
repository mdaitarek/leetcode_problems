/**
 * @param {number[]} nums
 * @return {number}
 */
var minPairSum = function(nums) {
    
    nums = nums.sort((a,b) => a - b);
    let left = 0, right = nums.length-1, max = 0;
    while(left<right){
        max = Math.max(max, (nums[left]+nums[right]));
        left++; right--;
    }

    return max;
};