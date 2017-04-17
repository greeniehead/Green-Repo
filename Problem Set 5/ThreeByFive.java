public class ThreeByFive
{
    public static void main(String[] args)
    {
        int[][] grid = new int[3][5];
        
        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                grid[row][col] =(int)((Math.random()*14)+1);
            }
        }
        
        for(int[] row : grid)
        {
            for(int num : row)
            {
                System.out.print(num + "  ");
            }
            System.out.println();
        }
        
        int sum = 0;
        for(int[] row : grid)
        {
            for(int num : row)
            {
                sum += num;
            }
        }
        System.out.println("Sum: " + sum);
        
        int sumRow = 0;
        int rowNum = 1;
        for(int[] row : grid)
        {
            for(int num : row)
            {
                sumRow += num;
            }
            System.out.println("Total of row #" + rowNum + ": " + sumRow);
            sumRow = 0;
            rowNum++;
        }
        
        int sumCol = 0;
        int colNum = 1;
        int[] temp = new int[3];
        for(int row = 0; row < 5; row++)
        {
            for(int i = 0; i < 3; i++)
            {
                temp[i] = grid[i][row];
            }
            for(int element : temp)
            {
                sumCol += element;
            }
            System.out.println("Total of column #" + colNum + ": " + sumCol);
            sumCol = 0;
            colNum++;
        }
    }
}