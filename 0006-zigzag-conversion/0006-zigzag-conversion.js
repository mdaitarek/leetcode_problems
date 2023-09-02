/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    let i=0, row=0, rowCol = false;
    const twoDim = [];
    while(i<s.length){
        if(!twoDim[row]) twoDim[row] = ""; 
        twoDim[row]+=s[i];
        if(!rowCol){
            row++;
        } else {
            row--;
        }
        i++;
        if(i%(numRows-1) === 0) rowCol = !rowCol;
    }
    return twoDim.join("");
};