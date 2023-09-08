class Solution {
    public List<String> cellsInRange(String s) {
      char initCol = s.charAt(0), finalCol = s.charAt(3);
      int initRow = Character.getNumericValue(s.charAt(1)), finalRow = Character.getNumericValue(s.charAt(4));
      List<String> list = new ArrayList<String>();
      for(char i=initCol; i<=finalCol; i++){
        for(int j=initRow; j<=finalRow; j++){
          list.add(i+String.valueOf(j));
        }
      }
      return list;
    }
}