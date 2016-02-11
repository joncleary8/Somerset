import java.util.Scanner;
public class Hand
	{
		static int bid = 0;
		public static void bid()
		{
			for (Player person : Introduction.playerList)
				{
					if (person.getPlayerHand()==1)
						{
							System.out.println(person.getPlayerName() + "will be the first bidder");
							playerBid();
						}
				}
		}
		
		public static int playerBid()
		{
			System.out.println("What would you like to bid? Bids must be between 15 and 24, inclusive.");
			Scanner inputBid = new Scanner (System.in);
			bid = inputBid.nextInt();
			if (bid<15 || bid>24)
				{
					playerBid();
				}
			return bid;
		}
	}
