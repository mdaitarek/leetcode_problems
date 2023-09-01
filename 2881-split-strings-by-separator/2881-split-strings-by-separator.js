/**
 * @param {string[]} words
 * @param {character} separator
 * @return {string[]}
 */
var splitWordsBySeparator = function(words, separator) {
    console.log(words.join(separator));
    return words.join(separator).split(separator).filter(word => word !== '');
};