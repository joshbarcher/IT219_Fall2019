package two_dimensional_arrays;

import java.util.Arrays;

public class Practice
{
    public static void main(String[] args)
    {
        //create space for a tic-tac-toe board
        char[][] ticTacToe = {
            {'_', '_'},
            {'O', 'O'},
            {'X', 'X'},
            {'_', 'O'}
        };

        //print out the board rows
        for (int i = 0; i < ticTacToe.length; i++)
        {
            //print out a single row
            for (int j = 0; j < ticTacToe[i].length; j++)
            {
                System.out.print(ticTacToe[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void theLongWay()
    {
        //create space for a tic-tac-toe board
        char[][] ticTacToe = new char[3][3];

        //assign some spots in the board
        ticTacToe[0][0] = ' ';
        ticTacToe[0][1] = 'X';
        ticTacToe[0][2] = 'X';

        ticTacToe[1][0] = 'O';
        ticTacToe[1][1] = 'O';
        ticTacToe[1][2] = 'X';

        ticTacToe[2][0] = 'O';
        ticTacToe[2][1] = 'X';
        ticTacToe[2][2] = ' ';
    }
}
