class Solution {
    public int surfaceArea(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    area += grid[i][j] * 4 + 2;
                    area -= (i - 1 >= 0) ? Math.min(grid[i][j], grid[i-1][j]) * 2 : 0;
                    area -= (j - 1 >= 0) ? Math.min(grid[i][j], grid[i][j-1]) * 2 : 0;
                }
            }
        }
        return area;
    }
}