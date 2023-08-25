/**
 * @param {number[]} nums
 * @return {number}
 */
var findShortestSubArray = function(nums) {
    const map = {};
    for(let i=0; i<nums.length; i++){
        if(!map[nums[i]]) {
            map[nums[i]] = {
                count: 0,
                left: i,
                right: i,
            };
        }
        map[nums[i]].count++;
        map[nums[i]].right = i;
    }
    let max = 0, res = nums.length;
    for(const key in map){
        let len = map[key].right - map[key].left + 1;
        if(map[key].count == max){
            res = Math.min(res, len);
        } else if( map[key].count > max){
            res = len;
            max = map[key].count;
        }
    }
    return res;
};