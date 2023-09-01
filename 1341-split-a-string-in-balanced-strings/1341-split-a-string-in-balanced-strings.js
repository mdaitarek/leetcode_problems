const checkBalanced = (string) => {
    let count = 0;
    for (let i = 0; i < string.length; i++) {
        if (string[i] === "R") count++;
    }
    return count === string.length/2;
};

var balancedStringSplit = function(s) {
    let output = 1;
    for (let i = 2; i < s.length; i += 2) {
        if (checkBalanced(s.slice(0, i))) {
            const newValue = 1 + balancedStringSplit(s.slice(i, s.length));
            if (newValue > output) {
                output = newValue;
                break;
            }
        }
    }
    return output;
};