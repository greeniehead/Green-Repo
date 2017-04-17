import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type how many rows and columns you want.");
        
        int rows = keyboard.nextInt();
        int cols = keyboard.nextInt();
        int[][] table = new int[rows][cols];
        for(int i = 0; i < rows; i++)
        {
            table[i][0] = i;
        }
        for(int i = 0; i < cols; i++)
        {
            table[0][i] = i;
        }
        for(int rowNum = 1; rowNum < rows; rowNum++)
        {
            for(int colNum = 1; colNum < cols; colNum++)
            {
                table[rowNum][colNum] = (table[0][colNum])*(table[rowNum][0]);
            }
        }
        
        for(int rowNum = 0; rowNum < rows; rowNum++)
        {
            for(int colNum = 0; colNum < cols; colNum++)
            {
                System.out.print(table[rowNum][colNum] + "\t");
            }
            System.out.println();
        }
    }
}