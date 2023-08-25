/**
 * @param {number[]} nums
 * @return {number}
 */
var findLHS = function(nums) {
    const map = {};
    let max=0;
    for(const num of nums) 
        map[num] ? map[num]++ : map[num] = 1;
    for(const item in map) 
        if(map[parseInt(item)+1]) 
            max = Math.max(max, map[item]+map[parseInt(item)+1]);
    
    return max;
};