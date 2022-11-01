class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String originalString : strs) {
            String sortedString = sort(originalString);
            if (!map.containsKey(sortedString))
                map.put(sortedString, new ArrayList<>());
            map.get(sortedString).add(originalString);
        }
        
        for (Map.Entry<String, List<String>> it : map.entrySet()) 
            list.add(it.getValue());
        
        return list;
    }
    
    private String sort (String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}