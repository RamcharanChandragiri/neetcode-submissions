class Solution {
    void function(char[][] grid,int i,int j){
        if(i<0 || j<0 ||i>=grid.length||j>=grid[0].length) return;
        if(grid[i][j]=='0') return;
        grid[i][j]='0';
        function(grid,i+1,j);
        function(grid,i,j+1);
        function(grid,i,j-1);
        function(grid,i-1,j);

    }
    public int numIslands(char[][] grid) {
        int land=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1') 
                {
                    function(grid,i,j);
                 land++;
                }
            }
        }
        return land;

    }
}