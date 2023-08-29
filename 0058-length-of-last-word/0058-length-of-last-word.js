/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    /**
    * My Solution 
    */
    // const words = s.split(" ");
    // let len=0;
    // for(let i=words.length-1; i>=0; i--){
    //     if(words[i]!=""){
    //         len = words[i].length;
    //         break;
    //     }
    // }
    // return len;
    
     /**
     * Best Solution 
     */
    const str = s.trim();
    let len = 0;
    for(let i=str.length-1; i>=0; i--){
        if(str[i]!==' ') len++;
        else break;
    }
    return len;
};