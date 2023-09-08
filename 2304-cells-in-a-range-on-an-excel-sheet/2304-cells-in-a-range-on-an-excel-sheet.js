/**
 * @param {string} s
 * @return {string[]}
 */
var cellsInRange = function(s) {
  const initCol = s.charCodeAt(0), finalCol = s.charCodeAt(3);
  const initRow = Number(s[1]), finalRow = Number(s[4]);
  const arr = [];
  for(let i=initCol; i<=finalCol; i++){
    const colLetter = String.fromCharCode(i);
    for(let j=initRow; j<=finalRow; j++){
      arr.push(`${colLetter}${j}`);
    }
  }
  return arr;
};