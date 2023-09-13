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
        if(char === ' ') decodedMessage+=' ';
        else { 
            decodedMessage+=alphabet[decodeKey.indexOf(char)]
        };
    }
    return decodedMessage;
};