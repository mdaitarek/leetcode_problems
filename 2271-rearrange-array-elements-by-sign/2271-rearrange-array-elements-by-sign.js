/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    const result = [];
    let positive = 0, negative = 1;
    for(const num of nums){
        if(num > 0){
            result[positive] = num;
            positive+=2;
        } else {
            result[negative] = num;
            negative+=2;
        }
    }
    return result;
};