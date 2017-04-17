public class ThreeByFive
{
    public static void main(String[] args)
    {
        int[][] grid = new int[3][5];
        
        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                grid[row][col] =(int)(Math.random()*6);
                System.out.print(grid[row][col]);
            }
            System.out.println("");
        }
        
        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                if(grid[row][col] == 2)
                {
                    System.out.println( "(" + row + ", " + col + ")" );
                }
            }
        }
    }
}