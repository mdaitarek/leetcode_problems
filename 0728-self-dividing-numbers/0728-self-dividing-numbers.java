class Solution {
    public boolean isSelfDividingNumber(int number){
        int tempNumber = number;
        while(tempNumber > 0){
            int digit = tempNumber % 10;
            if(digit == 0 || number%digit != 0) return false;
            tempNumber/=10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> selfDividingNums = new ArrayList<Integer>();
        while(left<=right){
            if(isSelfDividingNumber(left))
                selfDividingNums.add(left);
            left++;
        }
        return selfDividingNums;
    }
}