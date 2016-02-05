import java.awt.*;
import javax.swing.*;

public class GameRunner
	{
		public static void main(String[] args)
			{
				Deck.getShuffledDeck();
				Deck.dealDeck();
				for (Card fred : Deck.playerHand)
					{
						System.out.println((fred).getRank() +"/" + fred.getSuit());
					}
			}
	
	}
