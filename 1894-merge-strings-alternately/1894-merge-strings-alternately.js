/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let mergedWord = "";
    let len1 = word1.length, len2 = word2.length, i = 0;
    while(i<len1 || i<len2){
        if(i<len1)
            mergedWord+=word1[i];
        if(i<len2)
            mergedWord+=word2[i];
        i++;
    }

    return mergedWord;
};