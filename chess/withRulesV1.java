import java.util.Scanner;

public class withRulesV1
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean blackTF = true;
        boolean whiteTF = true;
        int whiteTurns = 0;
        int blackTurns = 0;
        
        String[][] board = new String[8][8];
        boolean end = true;
        for(int row = 7; row > -1; row--)//filling board with spaces
        {
            for(int col = 0; col < 8; col++)
            {
                if(board[row][col] == null)
                {
                    board[row][col] = "  ";
                }
            }
        }
        //initializing start of game
        board[0][0] = "WR";
        board[0][1] = "WH";
        board[0][2] = "WB";
        board[0][3] = "WQ";
        board[0][4] = "WK";
        board[0][5] = "WB";
        board[0][6] = "WH";
        board[0][7] = "WR";
        board[1][0] = "WP";
        board[1][1] = "WP";
        board[1][2] = "WP";
        board[1][3] = "WP";
        board[1][4] = "WP";
        board[1][5] = "WP";
        board[1][6] = "WP";
        board[1][7] = "WP";
        
        board[7][0] = "BR";
        board[7][1] = "BH";
        board[7][2] = "BB";
        board[7][3] = "BQ";
        board[7][4] = "BK";
        board[7][5] = "BB";
        board[7][6] = "BH";
        board[7][7] = "BR";
        board[6][0] = "BP";
        board[6][1] = "BP";
        board[6][2] = "BP";
        board[6][3] = "BP";
        board[6][4] = "BP";
        board[6][5] = "BP";
        board[6][6] = "BP";
        board[6][7] = "BP";
        for(int row = 7; row > -1; row--) //first board print out
        {
            System.out.print((row+1) + "  ");
            for(int col = 0; col < 8; col++)
            {
                System.out.print(board[row][col] + " ");
            }
            System.out.println("");
        }
        System.out.println("   A  B  C  D  E  F  G  H");
        
        while(end)//the entire game runs through this loop
        {
            //white turn start
            whiteTurns++;
            //piece selection
            int whitePieceRow = 0;
            int whitePieceCol = 0;
            while(whiteTF) //changing a letter into a number as well as checking that it is the correct piece
            {
                System.out.println("White player's turn.  Enter the row then column of the piece you wish to move.");
                whitePieceRow = keyboard.nextInt()-1;
                String whitePieceColLet = keyboard.next();
                if(whitePieceColLet == "A") // letter to number
                {
                    whitePieceCol = 0;
                }
                else if(whitePieceColLet == "B")
                {
                    whitePieceCol = 1;
                }
                else if(whitePieceColLet == "C")
                {
                    whitePieceCol = 2;
                }
                else if(whitePieceColLet == "D")
                {
                    whitePieceCol = 3;
                }
                else if(whitePieceColLet == "E")
                {
                    whitePieceCol = 4;
                }
                else if(whitePieceColLet == "F")
                {
                    whitePieceCol = 5;
                }
                else if(whitePieceColLet == "G")
                {
                    whitePieceCol = 6;
                }
                else
                {
                    whitePieceCol = 7;
                }
                if((board[whitePieceRow][whitePieceCol]).substring(0,1) == "W")//correct piece
                {
                    whiteTF = false;
                }
                else
                {
                    System.out.println("Not your piece, try again.");
                }
            }
            boolean whiteTf = true;
            
            //move selection
            System.out.println("Enter the row and column of the place you wish to move it.");
            int whiteMoveRow = keyboard.nextInt()-1;
            String whiteMoveColLet = keyboard.next();
            int whiteMoveCol = 0;
            if(whiteMoveColLet == "A")//letter to number
            {
                 whiteMoveCol = 0;
            }
            else if(whiteMoveColLet == "B")
            {
                whiteMoveCol = 1;
            }
            else if(whiteMoveColLet == "C")
            {
                whiteMoveCol = 2;
            }
            else if(whiteMoveColLet == "D")
            {
                whiteMoveCol = 3;
            }
            else if(whiteMoveColLet == "E")
            {
                whiteMoveCol = 4;
            }
            else if(whiteMoveColLet == "F")
            {
                whiteMoveCol = 5;
            }
            else if(whiteMoveColLet == "G")
            {
                whiteMoveCol = 6;
            }
            else if(whiteMoveColLet == "H")
            {
                whiteMoveCol = 7;
            }
            
            board[whiteMoveRow][whiteMoveCol] = board[whitePieceRow][whitePieceCol];
            board[whitePieceRow][whitePieceCol] = "  ";//replacing the square the piece moved from
            
            for(int row = 7; row > -1; row--)//after white turn print out
            {
                System.out.print((row+1) + "  ");
                for(int col = 0; col < 8; col++)
                {
                    System.out.print(board[row][col] + " ");
                }
                System.out.println("");
            }
            System.out.println("   A  B  C  D  E  F  G  H");
            
            System.out.println(whiteTurns + " : " + blackTurns); //turn print out
            
            //white turn end and black turn start
            //the black turn does not currently have the code for determining if the selected piece is correct
            //I will add that code when I have it working for one player
            blackTurns++;
            System.out.println("Black player's turn.  Enter the row then column of the piece you wish to move.");
            int blackPieceRow = keyboard.nextInt()-1;
            String blackPieceColLet = keyboard.next();
            int blackPieceCol = 0;
            if(blackPieceColLet == "A")//letter to number
            {
                blackPieceCol = 0;
            }
            else if(blackPieceColLet == "B")
            {
                blackPieceCol = 1;
            }
            else if(blackPieceColLet == "C")
            {
                blackPieceCol = 2;
            }
            else if(blackPieceColLet == "D")
            {
                blackPieceCol = 3;
            }
            else if(blackPieceColLet == "E")
            {
                blackPieceCol = 4;
            }
            else if(blackPieceColLet == "F")
            {
                blackPieceCol = 5;
            }
            else if(blackPieceColLet == "G")
            {
                blackPieceCol = 6;
            }
            else if(blackPieceColLet == "H")
            {
                blackPieceCol = 7;
            }
            
            System.out.println("Enter the row and column of the place you wish to move it.");
            int blackMoveRow = keyboard.nextInt()-1;
            String blackMoveColLet = keyboard.next();
            int blackMoveCol = 0;
            
            if(blackMoveColLet == "A")//letter to number
            {
                blackMoveCol = 0;
            }
            else if(blackMoveColLet == "B")
            {
                blackMoveCol = 1;
            }
            else if(blackMoveColLet == "C")
            {
                blackMoveCol = 2;
            }
            else if(blackMoveColLet == "D")
            {
                blackMoveCol = 3;
            }
            else if(blackMoveColLet == "E")
            {
                blackMoveCol = 4;
            }
            else if(blackMoveColLet == "F")
            {
                blackMoveCol = 5;
            }
            else if(blackMoveColLet == "G")
            {
                blackMoveCol = 6;
            }
            else if(blackMoveColLet == "H")
            {
                blackMoveCol = 7;
            }
            
            board[blackMoveRow][blackMoveCol] = board[blackPieceRow][blackPieceCol];
            board[blackPieceRow][blackPieceCol] = "  "; //replacing the square the piece moved from
            
            for(int row = 7; row > -1; row--)//after black turn print out
            {
                System.out.print((row+1) + "  ");
                for(int col = 0; col < 8; col++)
                {
                    System.out.print(board[row][col] + " ");
                }
                System.out.println("");
            }
            System.out.println("   A  B  C  D  E  F  G  H");
            
            System.out.println(whiteTurns + " : " + blackTurns); //turn counter
            //end of black turn and start of another white turn
        }
    }
}