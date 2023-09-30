/**
 * @param {string} s
 * @return {number}
 */
var countGoodSubstrings = function(s) {
    let total = 0;
    for(let i = 3; i<=s.length; i++){
        // console.log(s.slice((i-3), i));
        new Set(s.slice((i-3), i)).size === 3 && total++;
    }

    return total;
};