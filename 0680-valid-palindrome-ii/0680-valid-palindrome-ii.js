/**
 * @param {string} s
 * @return {boolean}
 */

var isPallindrome = function (s, i, j, count) {
    while(i<j){
        if(s[i] === s[j]){
            i++; j--;
        } else {
            if(count > 0){
                return false;
            } else if(i+1===j){
                return true;
            } else if( s[i+1] === s[j] && s[i] === s[j-1]) {
                return isPallindrome(s, i, j-1, count+1) || isPallindrome(s,i+1, j, count+1);
            } else if(s[i+1] === s[j]){
                i++; count++;
            } else if(s[i] === s[j-1]){
                j--; count++;
            } else {
                return false;
            }
        }
    }
    return true;
}
var validPalindrome = function(s) {
    return isPallindrome(s, 0, s.length-1, 0);
};