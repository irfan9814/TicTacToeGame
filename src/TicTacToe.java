import java.util.Scanner;
public class TicTacToe {
	
	static Scanner sc = new Scanner(System.in);
	
	static int [][] board = new int [3][3];
	
	static Integer player = 1;
	static Integer winner = 0;
	
	public static void main(String[] args) {		
		while(winner==0) {
			
		System.out.println("Player"+player+", give your next move"); 
			
		System.out.println("Input the next move row");
		int  row = sc.nextInt();
		
		System.out.println("Input the next move column");
		int column = sc.nextInt();
		
		if(board[row][column]==0)
			board[row][column]=player;
		
		else {
			System.out.println("The place is already marked, choose another position ");
			continue;
		}
		
		printBoard(board);
		
		int rowScore=0, colScore=0, diaScore=0, crossdiaScore=0; 
		for(int i=0; i<board.length; i++) {
			if(board[row][i]==player)
			rowScore++;
		}
		
		for(int i=0; i<board.length; i++) {
			if(board[i][column]==player)
			colScore++;
		}
		
		for(int i=0, j=0; i<board.length && j<board.length ; i++, j++) {

			if(board[i][j]==player)
			diaScore++;
			
		}
		
//		for(int j=board[0].length-1, i=0; i<board.length && j>0 ;i++, j--) {
//			if(board[i][column]==player);
//			crossdiaScore++;
//		}
		
		for(int i =0, j=board.length-1; i==j; i++,j--) {
			if (board[i][j]==player)
			crossdiaScore++;
		}
		
		if(rowScore==3 || colScore==3 || crossdiaScore == 3 || diaScore==3) {
			winner=player;
			System.out.println("The game has ended. The winner is player "+player);
		}
		else {
			if(player == 1)
				player = 2;
			else
				player = 1;
		}
		
	}
	} 
	
	private static void printBoard(int[][] board) {
		for(int i=0; i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
