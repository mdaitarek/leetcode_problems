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
   const result = [];
    const parseNum = (num) => {
        let copyNum = num;

        while (num > 0) {
            if (copyNum % (num % 10) !== 0) {
                return false;
            }

            num = Math.floor(num / 10);
        }

        return true;
    }

    while (left <= right) {
        const isFit = parseNum(left);

        if (isFit) {
            result.push(left);
        }

        left++;
    }

    return result;
};