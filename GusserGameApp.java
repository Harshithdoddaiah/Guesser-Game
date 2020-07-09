import java.util.Scanner;
class Guesser 
{
	int gnum;
	int guessNum()
	{
		System.out.println("Guesser! Kindly Guess the number from 1 to 100");
		Scanner scan=new Scanner(System.in);
		gnum=scan.nextInt();
		return gnum;
	}
}
class Player
{
	int pnum;
	int predictNum()
	{
		System.out.println("Player! a number between 1 to 100");
		Scanner scan=new Scanner(System.in);
		pnum=scan.nextInt();
		return pnum;
	}
}
class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	void collectFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.predictNum();
		numFromPlayer2=p2.predictNum();
		numFromPlayer3=p3.predictNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			System.out.println("Player 1 wins It");
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			System.out.println("Player 2 wins It");
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 wins It");
		}
		else
		{
			System.out.println("Game Lost! Try Again");
		}
	}
}
public class GusserGameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u =new Umpire();
		u.collectFromGuesser();
		u.collectFromPlayer();
		u.compare();

	}

}
