/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    const result = [];
    let positive = 0, negative = 1;
    for(let i=0; i<nums.length; i++){
        if(nums[i] > 0){
            result[positive] = nums[i];
            positive+=2;
        } else {
            result[negative] = nums[i];
            negative+=2;
        }
    }
    return result;
};