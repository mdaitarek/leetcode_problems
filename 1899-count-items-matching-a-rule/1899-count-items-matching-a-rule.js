/**
 * @param {string[][]} items
 * @param {string} ruleKey
 * @param {string} ruleValue
 * @return {number}
 */
var countMatches = function(items, ruleKey, ruleValue) {
    let index = 0, count = 0;
    if(ruleKey === "color") index = 1;
    else if(ruleKey === "name") index = 2;
    for(const item of items){
        if(item[index] === ruleValue) count++;
    }
    return count;
};