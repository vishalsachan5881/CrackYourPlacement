class Pair{
    int cap, rock, diff;
    public Pair(int c, int r, int d){
        cap = c;
        rock = r;
        diff = d;
    }
}
class Solution {
    public int maximumBags(int[] cap, int[] rocks, int add) {
         int n = rocks.length;
        Pair[] arr = new Pair[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = new Pair(cap[i], rocks[i] , cap[i]-rocks[i]);
        }
        Arrays.sort(arr, (a,b)-> a.diff - b.diff);
        int c = 0 ;
        for(var v : arr){
            int dif = v.diff;
            if(dif == 0) c++;
            else if(dif  <= add){
                c++;
                add -= dif;
            }
            
        }
        return c;
    }
}