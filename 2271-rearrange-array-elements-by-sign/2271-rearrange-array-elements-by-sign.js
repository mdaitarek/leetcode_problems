/**
 * @param {number[]} nums
 * @return {number[]}
 */
var rearrangeArray = function(nums) {
    let i=0, j=1;
    let res=[];

    for(let n of nums){
        if(n>0){//if n is positive number new arrary res[] first number is n
            res[i]=n
            i+=2;
        } else{
            res[j]=n;
            j+=2;
        }
    }
    return res;
};