/**
 * @param {string} key
 * @param {string} message
 * @return {string}
 */
var decodeMessage = function(key, message) {
    let alphabet= "abcdefghijklmnopqrstuvwxyz", decodeKey = "";
    for(let char of key)
        if(char !== ' ' && !decodeKey.includes(char))
            decodeKey+=char;
    let decodedMessage = "";
    for(let char of message){
        let index = decodeKey.indexOf(char);
        if(index === -1) decodedMessage+=' ';
        else decodedMessage+=alphabet[index];
    }
    return decodedMessage;
};