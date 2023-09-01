/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let chC = 0, maxSub = 0;
    for(const ch of s) {
        if(ch === 'R') chC++;
        else chC--;
        if(chC === 0) maxSub++;
    }
    return maxSub;
};