/**
 * @param {number[]} nums
 * @param {number} pivot
 * @return {number[]}
 */
var pivotArray = function(nums, pivot) {
    const smaller = [], equal = [], greater = [];
    for(const num of nums){
        if(num < pivot) smaller.push(num);
        else if(num == pivot) equal.push(num);
        else greater.push(num);
    }
    return [...smaller, ...equal, ...greater];
};