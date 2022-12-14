class Solution {
    public void fn(int[][] image, int sr, int sc, int color, int c){
        
       if(sr < 0 || sr > image.length-1 || sc < 0 || sc > image[0].length-1 || image[sr][sc] != c)
           return ;
        
        
        image[sr][sc] = color;
        fn(image,sr+1,sc,color,c);
        fn(image,sr-1,sc,color,c);
        fn(image,sr,sc+1,color,c);
        fn(image,sr,sc-1,color,c);
     }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        fn(image, sr, sc, color, image[sr][sc]);
        return image;
    }
}