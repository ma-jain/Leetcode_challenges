
public class number_of_islands {
    
    public static void main(String[] args){
        char[][] grid={
        {'1','1','0','0','0'},
        {'1','1','0','0','0'},
        {'0','0','1','0','0'},
        {'0','0','0','1','1'}};
        number_of_islands obj= new number_of_islands();
        System.out.println(obj.numIslands(grid));
    }
    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j]=='1'){
                    count++;
                    pass(grid, i, j);
                }
            }
        }
        return count;
    }
    public void pass(char[][] grid, int i, int j){
        if(i<0||j<0||i>=grid.length||j>=grid[i].length||grid[i][j]=='0') return;
        grid[i][j]='0';
        pass(grid, i+1, j);
        pass(grid, i, j+1);
        pass(grid, i-1, j);
        pass(grid, i, j-1);
return;

    }
}
