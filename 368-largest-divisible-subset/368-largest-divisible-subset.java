class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        int n = arr.length;
        if(n == 1){
            List<Integer> ls  = new ArrayList<>();
            ls.add(arr[0]);
            return ls;
        } 
        Arrays.sort(arr);
        int[] dp = new int[n];
        int[] hash = new int[n];
        for(int i = 0 ; i<hash.length;i++)
            hash[i] = i;
        Arrays.fill(dp,1);
        int max = 0,ind  = 0;
        for(int i = 0 ; i<n;i++){
            for(int prev = 0 ; prev < i ; prev++){
                if((arr[i] % arr[prev] == 0) && (dp[prev]+1 > dp[i])) {
                    dp[i] = dp[prev]+1;
                    hash[i]  = prev;
                    if(max < dp[i]){
                        max = dp[i];
                        ind = i;
                    }
                }
            }
        }
        
        LinkedList<Integer> l = new LinkedList<>();
        l.add(arr[ind]);
        while (hash[ind] != ind){
            ind = hash[ind];
            l.addLast(arr[ind]);
        }
        return new ArrayList<>(l);
        
    }
}