/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */
 
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