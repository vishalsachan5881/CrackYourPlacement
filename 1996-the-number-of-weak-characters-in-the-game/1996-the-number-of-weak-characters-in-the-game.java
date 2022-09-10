class Solution {
    public int numberOfWeakCharacters(int[][] p) {
       Arrays.sort(p, (a,b)-> (b[0] == a[0]) ? (a[1] - b[1]) : b[0] - a[0]);
       int c = 0, max = -1;
        for(int i = 0 ; i  < p.length;i++){
            if(p[i][1] < max) c++;
            else max = Math.max(max, p[i][1]);
        }
        return c;
    }
}