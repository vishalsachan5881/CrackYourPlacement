class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<HashMap<Character,Integer>, List<String>> baap = new HashMap<>();
        for(var v : strs){
            HashMap<Character, Integer> hm = new HashMap<>();
            for(int i = 0 ; i < v.length();i++)
                hm.put(v.charAt(i), hm.getOrDefault(v.charAt(i) , 0) + 1);
            
            if(baap.containsKey(hm))
                baap.get(hm).add(v);
            else {
                baap.put(hm , new ArrayList<>());
                baap.get(hm).add(v);
            }
        }
        for(var v : baap.values())
            ans.add(v);
        
        return ans;
        
    }
}