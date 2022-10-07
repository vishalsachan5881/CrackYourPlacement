class Pair{
    int x, y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class Solution {
    public static boolean isValid(int sr, int sc, int[][] image, int type){
        if(sr < 0 || sc < 0 || sc >= image[0].length || sr >= image.length || image[sr][sc]!=type) return false;
        return true;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int color1 = color;
        color = -1;
        int type = image[sr][sc];
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(sr, sc));
        image[sr][sc] = color;
        while(!q.isEmpty()){
            //System.out.println(q.toString())
            int n = q.size();
            for(int i = 0 ; i  < n ; i++){
            Pair curr = q.poll();
           
                
                
            if(isValid(curr.x+1, curr.y, image, type)){
                image[curr.x+1][curr.y] = color;
                q.offer(new Pair(curr.x+1, curr.y));
            }
                 if(isValid(curr.x-1, curr.y, image, type)){
                image[curr.x-1][curr.y] = color;
                q.offer(new Pair(curr.x-1, curr.y));
            }
                 if(isValid(curr.x, curr.y+1, image,type)){
                image[curr.x][curr.y+1] = color;
                q.offer(new Pair(curr.x, curr.y+1));
            }
                 if(isValid(curr.x, curr.y-1, image,type)){
                image[curr.x][curr.y-1] = color;
                q.offer(new Pair(curr.x, curr.y-1));
            }
                
            }
            
        }
        for(int i = 0 ; i < image.length; i++)
            for(int c = 0  ; c < image[0].length;c++){
                if(image[i][c] == -1)
                    image[i][c] = color1;
            }
        
        return image;
    }
}