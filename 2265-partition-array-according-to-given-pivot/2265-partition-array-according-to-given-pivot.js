/**
 * @param {number[]} nums
 * @param {number} pivot
 * @return {number[]}
 */
var pivotArray = function(nums, pivot) {
    const smaller = [], equal = [], greater = [];
    for(let i=0; i<nums.length; i++){
        if(nums[i] < pivot) smaller.push(nums[i]);
        else if(nums[i] == pivot) equal.push(nums[i]);
        else greater.push(nums[i]);
    }
    return smaller.concat(equal, greater);
};