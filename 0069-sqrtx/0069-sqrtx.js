/**
 * @param {number} x
 * @return {number}
 */
var mySqrt = function(x) {
    let low=1, high = Math.ceil(x/2);
    let mid = Math.floor((high+low)/2);
    if( x === 0 ) return 0;
    if( x === 1) return 1;
    while(low<=high){
        // console.log({low, mid, high});
        if((low*low) === x) return low;
        else if((mid*mid) === x) return mid;
        else if((high*high) === x) return high;
        else if((mid*mid) <= x &&  ((mid+1)*(mid+1)) > x) return mid;
        else if((low*low) <= x && x <= (mid*mid) ) {
            high = mid-1;
            mid = Math.floor((high+low)/2);
        } else {
            low = mid+1;
            mid = Math.floor((high+low)/2);
        }
    }
    return mid;
};