/**
 * @param {string} s
 * @return {boolean}
 */

var isPallindrome = function (s, i, j, count) {
    if(count > 1) return false;
    while(i<j){
        if(s[i] === s[j]){
            i++; j--;
        } else
            return isPallindrome(s, i, j-1, count+1) || isPallindrome(s, i+1, j, count+1);
    }
    return true;
}
var validPalindrome = function(s) {
    return isPallindrome(s, 0, s.length-1, 0);
};