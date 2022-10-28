class Pair{
    String s;
    int i;
    public Pair(String ss,  int ii){
        s  = ss;
        i =  ii;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Pair[] fin = new Pair[n];
        for(int i = 0 ; i < n; i++){
            String str = strs[i];
            char[] c = str.toCharArray();
            Arrays.sort(c);
            fin[i] = new Pair(new String(c), i);
        }
        Arrays.sort(fin, (a,b)-> a.s.compareTo(b.s));
        List<List<String>> ans = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        temp.add(strs[fin[0].i]);
        for(int i = 1 ; i < n ; i++){
            if(fin[i].s.equals(fin[i-1].s))
                temp.add(strs[fin[i].i]);
            else{
                ans.add(temp);
                temp = new ArrayList<>();
                temp.add(strs[fin[i].i]);
            }
        }
        ans.add(temp);
        return ans;
    }
}