package aop;

public class Board {
	final String EMPTY = "N";
	final String x = "X";
	final String o = "O";
	final String boardColumn = "|";
	final String boardRow = "_ _ _";
	
	String[][] board;
	
	public Board() {
		board = new String [3][3];
		setEmpty();
	}
	
	public void setEmpty() {
		for(int i =0; i < 3; i++) {
			for(int j =0; j <3; j++)
				board[i][j] = EMPTY;
		}
	}
	
	public void displayBoard() {
		System.out.print(getTopLeft()); 
		System.out.print(boardColumn);
		System.out.print(getTopMiddle());
		System.out.print(boardColumn);
		System.out.print(getTopRight()); 
		System.out.print("\n");
		System.out.println(boardRow); 
		System.out.print(getMiddleLeft()); 
		System.out.print(boardColumn);
		System.out.print(getMiddle()); 
		System.out.print(boardColumn); 
		System.out.print(getMiddleRight());
		System.out.print("\n"); 
		System.out.println(boardRow); 
		System.out.print(getBottomLeft());
		System.out.print(boardColumn); 
		System.out.print(getBottomMiddle()); 
		System.out.print(boardColumn);
		System.out.print(getBottomRight());
		System.out.println();
	}
	
	public boolean boardFilled() {
		boolean filled = true;
		
		for(int i =0; i < 3; i++) {
			for(int j =0; j <3; j++)
				if(board [i][j].equals(EMPTY))
					filled = false;			
		}
		return filled;
	}
	
	public void changeTopLeft(String token) {
		if(board[0][0].equals(EMPTY)) {
			board[0][0]= token;
		}
		else {
			System.out.println("Spot taken by: " + board[0][0].toString() + ". Please choose another spot.");
		}		
	}
	
	public String getTopLeft() {
		return board[0][0];
	}
	
	public void changeTopMiddle(String token) {
		if(board[0][1].equals(EMPTY)) {
			board[0][1]= token;
		}
		else {
			System.out.println("Spot taken by: " + board[0][1].toString() + ". Please choose another spot.");
		}				
	}
	
	public String getTopMiddle() {
		return board[0][1];
	}
	
	public void changeTopRight(String token) {
		if(board[0][2].equals(EMPTY)) {
			board[0][2]= token;
		}
		else {
			System.out.println("Spot taken by: " + board[0][2].toString() + ". Please choose another spot.");
		}				
	}
	
	public String getTopRight() {
		return board[0][2];
	}
	
	public void changeMiddleLeft(String token) {
		if(board[1][0].equals(EMPTY)) {
			board[1][0]= token;
		}
		else {
			System.out.println("Spot taken by: " + board[1][0].toString() + ". Please choose another spot.");
		}				
	}
	
	public String getMiddleLeft() {
		return board[1][0];
	}
	
	public void changeMiddle(String token) {
		if(board[1][1].equals(EMPTY)) {
			board[1][1]= token;
		}
		else {
			System.out.println("Spot taken by: " + board[1][1].toString() + ". Please choose another spot.");
		}				
	}
	
	public String getMiddle() {
		return board[1][1];
	}
	
	public void changeMiddleRight(String token) {
		if(board[1][2].equals(EMPTY)) {
			board[1][2]= token;
		}
		else {
			System.out.println("Spot taken by: " + board[1][2].toString() + ". Please choose another spot.");
		}				
	}
	
	public String getMiddleRight() {
		return board[1][2];
	}
	
	public void changeBottomLeft(String token) {
		if(board[2][0].equals(EMPTY)) {
			board[2][0]= token;
		}
		else {
			System.out.println("Spot taken by: " + board[2][0].toString() + ". Please choose another spot.");
		}				
	}
	
	public String getBottomLeft() {
		return board[2][0];
	}
	
	public void changeBottomMiddle(String token) {
		if(board[2][1].equals(EMPTY)) {
			board[2][1]= token;
		}
		else {
			System.out.println("Spot taken by: " + board[2][1].toString() + ". Please choose another spot.");
		}				
	}
	
	public String getBottomMiddle() {
		return board[2][1];
	}
	
	public void changeBottomRight(String token) {
		if(board[2][2].equals(EMPTY)) {
			board[2][2]= token;
		}
		else {
			System.out.println("Spot taken by: " + board[2][2].toString() + ". Please choose another spot.");
		}				
	}
	
	public String getBottomRight() {
		return board[2][2];
	}

	public String getX() {
		return x;
	}

	public String getO() {
		return o;
	}
}
