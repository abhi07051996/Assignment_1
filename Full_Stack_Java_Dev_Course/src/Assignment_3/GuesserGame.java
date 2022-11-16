package Assignment_3;

import java.util.Scanner;



class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number between 1 to 20");
		guessNum=scan.nextInt();
		
		while(guessNum >20 || guessNum <1 ) {
			System.out.println("Your number is not between 1 and 20. Please enter no. between 1 and 20");
			guessNum=scan.nextInt();
			
			
		}
		return guessNum;
		
	}	
}

class Player
{
	int guessNum;
	
	int guessNum(int x)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player " + x + " kindly guess the number ");
		guessNum=scan.nextInt();
		
		while(guessNum >20 || guessNum <1 ) {
			System.out.println("Hi Player " +x+ ", your number is not between 1 and 20. Please enter no. between 1 and 20");
			guessNum=scan.nextInt();
			
			
		}
		
		
		return guessNum; 
		
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		
		numFromGuesser=g.guessNum(); 
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum(1);
		numFromPlayer2=p2.guessNum(2);
		numFromPlayer3=p3.guessNum(3);
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
			Scanner scan=new Scanner(System.in);
			System.out.println("Press 1 if you want to play again, Press 2 if you want to quit ");
			int playAgain=scan.nextInt();
			if(playAgain==1) {
			collectNumFromPlayers();
			compare();}
			else
				System.out.println("Thanks for playing!!");
			
		}
		
	}
	
}



public class GuesserGame {

	public static void main(String[] args) {
		
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}
