/**
 * @param {number[]} nums
 * @return {number}
 */
var findLHS = function(nums) {
    nums = nums.sort((a, b) => a - b);
    let max=0, l=0, r=1,n=nums.length;
    while(r<n){
        let diff = nums[r] - nums[l];
        if(diff === 1){
            max = Math.max(max, (r-l+1));
        }
        if(diff <= 1) r++;
        else l++;
    }
    return max;
};