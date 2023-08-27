/**
 * @param {string[]} list1
 * @param {string[]} list2
 * @return {string[]}
 */
var findRestaurant = function(list1, list2) {
    const strMap = {};
    let list = [], min = Number.MAX_VALUE;
    
    for(let i=0; i<list1.length; i++) strMap[list1[i]] = i;
    
    for(let i=0; i<list2.length; i++) {
        let j = strMap[list2[i]];
        if(j !== undefined && i+j<=min){
            if(i+j<min){
                list = [];
                min = i + j;
            }
            list.push(list2[i]);
        }
    }
    
    return list;
};