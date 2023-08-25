class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> strMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<String>();
        int min = Integer.MAX_VALUE;

        for(int i=0; i<list1.length; i++) strMap.put(list1[i], i);
        for(int i=0; i<list2.length; i++) {
            Integer j = strMap.get(list2[i]);
            if(j != null && i+j <= min ){
                if(i+j < min){
                    list.clear();
                    min = i+j;
                }
                list.add(list2[i]);
            }
        }
        return list.toArray(new String[list.size()]);
    }
}