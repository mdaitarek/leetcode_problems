/**
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function(s, numRows) {
    let i=0, n=s.length, row=0, col=0, count=0, rowCol = false;
    const twoDim = [];
    while(i<n){
        if(!twoDim[row]) twoDim[row] = [];
        twoDim[row][col] = s[i];
        if(!rowCol){
            row++;
        } else {
            row--;
            col++;
        }
        i++;
        if(i%(numRows-1) === 0) rowCol = !rowCol;
    }
    return twoDim.map(arr => arr.join("")).join("");
};