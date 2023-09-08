class Solution {
    public List<String> cellsInRange(String s) {
      char initCol = s.charAt(0), finalCol = s.charAt(3);
      char initRow = s.charAt(1), finalRow = s.charAt(4);
      List<String> list = new ArrayList<String>();
      for(char i=initCol; i<=finalCol; i++){
        for(char j=initRow; j<=finalRow; j++){
          list.add(i+""+j);
        }
      }
      return list;
    }
}