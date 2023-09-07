/**
 * @param {number} num
 * @return {number}
 */
var addDigits = function(num) {
    if(num<10) return num;
    while(num>=10){
        num = String(num).split("").reduce((total, digit)=> total+=Number(digit), 0);
    }
    return num;
};