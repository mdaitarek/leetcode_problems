/**
 * @param {string} key
 * @param {string} message
 * @return {string}
 */
var decodeMessage = function(key, message) {
    let a = 97, set = {};
    for(let char of key)
        if(char !== ' ' && !set[char])
            set[char] = String.fromCharCode(a++);
    let str = "";
    for(let char of message)
        if(char !== ' ')
            str+=set[char];
        else
            str+=char;
    return str;
};