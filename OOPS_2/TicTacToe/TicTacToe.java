package OOPS_2.TicTacToe;

import java.util.Scanner;

public class TicTacToe {
	private Player player1,player2;
	private Board board;
	private int numPlayers;

	public static void main(String[] args) {
		TicTacToe t=new TicTacToe();
		t.startGame();
	}

	public void startGame(){
		// Take players input
		Scanner s= new Scanner(System.in);
		
		player1 = takPlayerInput(++numPlayers);
		player2 = takPlayerInput(++numPlayers);
		while (player1.getSymbol()==player2.getSymbol()) {
			System.out.println("symbol already taken!! Please enter another symbol again.");
			player2.setSymbol(s.next().charAt(0));
		}
		// Create the board
		board=new Board(player1.getSymbol(), player2.getSymbol());
		// Play the game
		boolean player1turn=true;
		int status= Board.INCOMPLETE;
		while (status == Board.INCOMPLETE || status== Board.INVALIDMOVE) {
			if (player1turn) {

				System.out.println("Player 1 - "+player1.getName()+"'s turn");
				System.out.println("Enter X: ");
				int x=s.nextInt();
				System.out.println("Enter Y: ");
				int y=s.nextInt();

				status=board.move(player1.getSymbol(),x,y);
				if (status==Board.INVALIDMOVE) {
					System.out.println("Invalid Move!! Please try again.");
					continue;
				}
			}else{

				System.out.println("Player 2 - "+player2.getName()+"'s turn");
				System.out.println("Enter X: ");
				int x=s.nextInt();
				System.out.println("Enter Y: ");
				int y=s.nextInt();

				status=board.move(player2.getSymbol(),x,y);
				if (status==Board.INVALIDMOVE) {
					System.out.println("Invalid Move!! Please try again.");
					continue;
				}
			}
			player1turn=!player1turn;
			board.print();
		}
		if (status==Board.PLAYER1WINS) {
			System.out.println("Player 1 - "+player1.getName()+" wins !!");
		}else if (status==Board.PLAYER2WINS) {
			System.out.println("Player 2 - "+player2.getName()+" wins !!");
		}else{
			System.out.println("DRAW !!");
		}
		s.close();
	}

	private Player takPlayerInput(int num){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter player "+num+" name: ");
		String name=s.nextLine();
		System.out.println("Enter player "+num+" symbol: ");
		char symbol=s.next().charAt(0);
		Player p= new Player(name, symbol);
		s.close();
		return p;
	}

	 
}
