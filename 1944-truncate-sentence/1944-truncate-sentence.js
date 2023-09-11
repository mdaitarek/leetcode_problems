/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var truncateSentence = function(s, k) {
    // let str = "";
    // for(const char of s){
    //     if(char === " ") k--;
    //     if(k === 0) break;
    //     str+=char;
    // }
    // return str;
    const str = s.split(" ");
    if(k>=str) return s;
    return str.filter((element, index) => index < k ).join(" ");
};