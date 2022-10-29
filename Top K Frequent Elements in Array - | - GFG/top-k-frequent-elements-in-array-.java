//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = Integer.parseInt(s[i + 1]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            int[] ans = obj.topK(nums, k);
            for (int i = 0; i < ans.length; i++) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends

class Pair{
    int x,y;
    public Pair(int aa, int bb){
        x= aa;
        y = bb;
    }
}
class Solution {
    public int[] topK(int[] nums, int k) {
        // Code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(var v : nums)
        hm.put(v, hm.getOrDefault(v, 0)+1);
        
        int n = hm.size();
        Pair[] arr = new Pair[n];
        int i = 0;
        for(var v : hm.keySet()){
            arr[i++] = new Pair(v, hm.get(v));
        }
        
        
        Arrays.sort(arr , (a,b) -> (b.y==a.y) ? b.x - a.x : b.y - a.y );
        int[] ans= new int[k];
        for(int ii = 0 ; ii < k ; ii++){
            ans[ii] = arr[ii].x;
        }
        
        return ans;
        
    }
}