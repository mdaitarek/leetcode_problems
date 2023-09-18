/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
    const map = {};
    for(let i=0; i<nums.length; i++){
      if(!map[nums[i]]) map[nums[i]] = 0;
      map[nums[i]]++;
    }

    let pairs = 0;

    for(const key in map){
      let count = map[key];
      pairs+=( count * (count-1) / 2);
    }
    return pairs;
};