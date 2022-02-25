package aop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String player1, player2;
		Board b = new Board();
		Scanner in = new Scanner(System.in);
		Referee r = new Referee(b);	
		System.out.println("Welcome to AOP Tic-Tac-Toe. Created By: Benny Iko");
		System.out.println("Player-1 enter your name:");
		player1 = in.nextLine();
		System.out.println("Player-1 " + player1+ " enter your symbol [X or O]:");
		player1 = in.nextLine() + 1 + player1;
		char p1Symbol = player1.charAt(0);
		if(p1Symbol == ('X'))
		{
			player2 = "O" + 2 ;
		}
		else
		{
			player2 = "X" + 2 ;
		}
			
		System.out.println("Player-2 enter your name:");
		player2 = player2 + in.nextLine();
		String turn = player1;
		
		while(r.gameOver == false){
			turn(player1,b);
			b.displayBoard();
			System.out.println();
			System.out.println();
			turn = player2;
			turn(player2, b);
		}


}
	
	
	public static void displayOptions(){
		System.out.print("1"); 
		System.out.print("|");
		System.out.print("2");
		System.out.print("|");
		System.out.print("3"); 
		System.out.print("\n");
		System.out.println("_ _ _"); 
		System.out.print("4"); 
		System.out.print("|");
		System.out.print("5"); 
		System.out.print("|"); 
		System.out.print("6");
		System.out.print("\n"); 
		System.out.println("_ _ _"); 
		System.out.print("7");
		System.out.print("|"); 
		System.out.print("8");
		System.out.print("|");
		System.out.print("9");
		System.out.println();
	}
	
	public static void turn(String player, Board b) {
		System.out.println("Player" + player.substring(1, 1) + " " + player.substring(2) + " -> Your time togo. Pick the number for your spot, then press ENTER ->");
		displayOptions();
		System.out.println();
		b.displayBoard();
		var in = new Scanner(System.in);
		var input = in.nextLine();
		input = input.toUpperCase();
		Character c = player.charAt(0);
		var symbol = c.toString();	
		
		switch(input) {
		
		case "1": 
			b.changeTopLeft(symbol);
			break;
		case "2":
			b.changeTopMiddle(symbol);
			break;
		case "3":
			b.changeTopRight(symbol);
			break;
		case "4":
			b.changeMiddleLeft(symbol);
			break;
		case "5":
			b.changeMiddle(symbol);
			break;
		case "6":
			b.changeMiddleRight(symbol);
			break;
		case "7":
			b.changeBottomLeft(symbol);
			break;
		case "8":
			b.changeBottomMiddle(symbol);
			break;
		case "9":
			b.changeBottomRight(symbol);
			break;
				
		
		}
	}
}
