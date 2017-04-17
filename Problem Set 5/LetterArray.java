import java.util.Scanner;

public class LetterArray
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns you want.");
        
        int rows = keyboard.nextInt();
        int cols = keyboard.nextInt();
        char[][] grid = new char[rows][cols];
        char let = 'a';
        for(int rowNum = 0; rowNum < rows; rowNum++)
        {
            for(int colNum = 0; colNum < cols; colNum++)
            {
                grid[rowNum][colNum] = let;
                if(let == 'z')
                {
                    let = 'a';
                }
                else
                {
                    let++;
                }
            }
        }
        
        for(int rowNum = 0; rowNum < rows; rowNum++)
        {
            for(int colNum = 0; colNum < cols; colNum++)
            {
                System.out.print(grid[rowNum][colNum] + "\t");
            }
            System.out.println();
        }
    }
}