class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<groupSizes.length; i++){
          List<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<>());
          list.add(i);
          map.put(groupSizes[i], list);
        }

        for(Map.Entry<Integer, List<Integer>> entry : map.entrySet()){
          int size = entry.getKey();
          List<Integer> list = entry.getValue();
          List<Integer> resultList = new ArrayList<>();
          int count = 0;
          for(int i=0; i<list.size(); i++){
            if(count >= size){
              count = 0;
              result.add(resultList);
              resultList = new ArrayList<>();
            }
            resultList.add(list.get(i));
            count++;
          }
          result.add(resultList);
        }

        return result;
    }
}