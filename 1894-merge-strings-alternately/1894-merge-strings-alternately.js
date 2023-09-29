/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    let mergedWord = "";
    let len1 = word1.length, len2 = word2.length, i = 0;
    let n = Math.max(len1, len2);
    while(i<n){
        if(i<len1 && i<len2)
            mergedWord+=(word1[i] + word2[i]);
        else if(i>=len1 && i<len2)
            mergedWord+=word2[i];
        else if(i<len1 && i>=len2)
            mergedWord+=word1[i];

        i++;
    }

    return mergedWord;
};