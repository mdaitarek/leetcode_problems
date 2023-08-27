/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    let max = -Number.MAX_VALUE, sum=0;
     for(const num of nums){
         sum+=num;
         if(sum>=max) max = sum;
         if(sum<0) sum=0;
    }
    return max;   
};


