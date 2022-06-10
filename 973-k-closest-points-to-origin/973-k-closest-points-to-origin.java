class Pair{
    int x,y;
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Pair[] arr = new Pair[points.length];
        for(int i = 0;i<points.length;i++)
            arr[i] = new Pair(points[i][0],points[i][1]);
        
        Arrays.sort(arr,(a,b)->{
            return ((a.x*a.x+a.y*a.y)-(b.x*b.x+b.y*b.y));
        });
            
        int[][] ans =  new int[k][2];
        for(int i = 0;i<k;i++){
            ans[i][0] = arr[i].x;
              ans[i][1] = arr[i].y;
        }
        
        return ans;
    }
}