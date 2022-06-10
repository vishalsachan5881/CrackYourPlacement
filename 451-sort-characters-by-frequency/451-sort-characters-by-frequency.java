class Pair{
    int index;
    char c;
    Pair(int index, char c){
        this.index = index;
        this.c = c;
    }
}
class Solution {
    public String frequencySort(String s) {
        int n = s.length();
      //  int[] arr = new int[26];
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0; i<n;i++){
            if(hm.containsKey(s.charAt(i)))
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            else
                hm.put(s.charAt(i),1);
        }
        Pair[] arr= new Pair[hm.size()]; 
        int index = 0;
        for(var v : hm.keySet())
            arr[index++] = new Pair( hm.get(v),v);
        
        Arrays.sort(arr, (a,b)->{
            return b.index-a.index;
        });
        
        
        StringBuilder ss = new StringBuilder();
        for(int i = 0 ; i<arr.length;i++){
            String result = new String(arr[i].c+"");
            ss.append(result.repeat(hm.get(arr[i].c)));
        }
        return new String(ss);
    }
}