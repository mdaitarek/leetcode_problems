/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */

var isSelfDividing = function(number){
  if(number < 10) return true;
  const digits = new Set(number.toString().split(""));
  for(const digit of digits){
    if(digit === '0' || number % Number(digit) !== 0) return false;
  }
  return true;
}

var selfDividingNumbers = function(left, right) {
  const selfDividingNumbers = [];
    while(left<=right){
      if(isSelfDividing(left))
        selfDividingNumbers.push(left);
      left++;
    }
    return selfDividingNumbers;
};