package aop;

import java.util.Scanner;

public class Main {
	String player1, player2;
	Board b;
	Referee r;
	
	public static void main(String[] args) {
		Main m = new Main();
		m.b = new Board();
		m.r = new Referee(m.b);
		Scanner in = new Scanner(System.in);		
		System.out.println("Welcome to AOP Tic-Tac-Toe. Created By: Benny Iko");
		System.out.println("Player-1 enter your name:");
		m.player1 = in.nextLine();
		System.out.println("Player-1 " + m.player1+ " enter your symbol [X or O]:");
		m.player1 = in.nextLine().toUpperCase() + 1 + m.player1;
		char p1Symbol = m.player1.charAt(0);
		if(p1Symbol == ('X'))
		{
			m.player2 = "O" + 2 ;
		}
		else
		{
			m.player2 = "X" + 2 ;
		}
		System.out.println("Player-2 enter your name:");
		m.player2 = m.player2 + in.nextLine();
		String turn = m.player1;
		
		while(m.r.gameOver == false){
			m.turn(m.player1);
			m.b.displayBoard();
			System.out.println();
			System.out.println();
			if(m.r.gameOver) {
				break;
			}		
			turn = m.player2;
			m.turn(m.player2);
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
	
	public Referee turn(String player) {
		
		System.out.println();
		displayOptions();
		System.out.println();
		b.displayBoard();
		System.out.println();
		System.out.println("Player " + "[" + player.substring(0, 1) + "]" +  ": " + player.substring(2) + " -> Your time togo. Pick the number for your spot, then press ENTER ->");
		var in = new Scanner(System.in);
		var input = in.nextLine();
		boolean status = b.isTaken(input);
		
		while(status) {
			System.out.println("Spot Taken. Please Try Again.");
			System.out.println("Player " + "[" + player.substring(0, 1) + "]" +  ": " + player.substring(2) + " -> Your time togo. Pick the number for your spot, then press ENTER ->");
			input = in.nextLine();		
			status = b.isTaken(input);
		}
		//System.out.println(status);
		//input = input.toUpperCase();
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
		
		return r;
	}
}
