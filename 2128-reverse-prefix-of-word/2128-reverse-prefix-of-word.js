/**
 * @param {string} word
 * @param {character} ch
 * @return {string}
 */
var reversePrefix = function(word, ch) {
    let start = 0, end = 0;
    for(let i=0; i<word.length; i++){
        if(word[i] === ch){
            end = i;
            break;
        }
    }
    word = word.split("");
    while(start < end){
        [word[start], word[end]] = [word[end], word[start]];
        start++; end--;
    }

    return word.join("");
};