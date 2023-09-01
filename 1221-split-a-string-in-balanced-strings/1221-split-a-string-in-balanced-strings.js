/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let chC = 0, maxSub = 0;
    for(let i=0; i<s.length; i++) {
        if(s[i] === 'R') chC++;
        else chC--;
        if(chC === 0) maxSub++;
    }
    return maxSub;
};