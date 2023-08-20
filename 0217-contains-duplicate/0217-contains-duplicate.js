/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function(nums) {
    const kv = {};
    for(const num of nums) 
        if(typeof kv[num] === 'number') return true;
        else kv[num] = num;
    return false;
};