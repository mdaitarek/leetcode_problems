/**
 * @param {number[][]} image
 * @return {number[][]}
 */

var invert = function (digit){
    return digit === 0 ? 1 : 0;
}

var flipAndInvertImage = function(image) {
    for(const row of image){
        let left = 0, right = row.length-1;
        while(left<right){
            if(row[left] == row[right]){
                row[left] = invert(row[left]);
                row[right] = invert(row[right]);
            }
            right--;
            left++;
        }
        if(left === right)
            row[left] = invert(row[left]);
    }

    return image; 
};