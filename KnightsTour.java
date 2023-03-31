package knightsTour;
import java.text.DecimalFormat;

public class KnightsTour 
{
	DecimalFormat numberFormat = new DecimalFormat("###,###,###");
	int rowSize = 8;
	int columnSize = 8;
	int boardNum = 0;
	int moveNum = 0;
	private int lastLevel = rowSize * columnSize;
	int [][] board = new int [rowSize][columnSize];
	
	public void startGame()
	{

		int row = 0;
		int column = 0;
		tour(row,column);
	}

	public void tour(int row, int column)
	{
		moveNum++;
		board[row][column] = moveNum; 
				
		if(moveNum == lastLevel)
			{
					printBoard();
			}
			if(safeMove(row + 2, column + 1 )) //1
			{
				tour(row + 2, column + 1);
				board[row + 2][column + 1] = 0;
			}
			if(safeMove(row + 1, column + 2 )) //2
			{
				tour(row + 1, column + 2);
				board[row + 1][column + 2] = 0;
			}
			if(safeMove(row - 1, column + 2 )) //3
			{
				tour(row - 1, column + 2);
				board[row - 1][column + 2] = 0;
			}
			if(safeMove(row - 2, column + 1 )) //4
			{
				tour(row - 2, column + 1);
				board[row - 2][column + 1] = 0;
			}
			if(safeMove(row - 2, column - 1 )) //5
			{
				tour(row - 2, column - 1);
				board[row - 2][column - 1] = 0;
			}
			if(safeMove(row - 1, column - 2 )) //6
			{
				tour(row - 1, column - 2);
				board[row - 1][column - 2] = 0;
			}
			if(safeMove(row + 1, column - 2 )) //7
			{
				tour(row + 1, column - 2);
				board[row + 1][column - 2] = 0;
			}
			if(safeMove(row + 2, column - 1 )) //8
			{
				tour(row + 2, column - 1);
				board[row + 2][column - 1] = 0;
			}
			board[row][column]= 0;
			moveNum--;
				
	}
	private boolean safeMove(int row, int column)
	{
		return((row >= 0 && row < rowSize) && column >= 0 && (column < columnSize) && board[row][column]== 0);
	}
	
	public void printBoard()
	{
		boardNum++;
		String num = numberFormat.format(boardNum);
		System.out.println("\nboard number " + num + "\n");
		
		for( int row = 0; row < board.length; row++)
		{
			for(int column = 0; column < board[row].length; column++)
			{
				if(board[row][column] < 10)
				{
					System.out.print(" " + board[row][column]+ " ");
				}
				else 
				{
					System.out.print(board[row][column] + " ");
				}	
			}
			System.out.println();
		}	
	}

	
	
}

	
	
	/**
	 * any corner 304 solutions 
	 * (2,2) 64 solutions
	 * (2,0) 56 solutions
	 */

