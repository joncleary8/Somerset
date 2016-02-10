import java.awt.*;
import javax.swing.*;

public class GameRunner
	{
		public static void main(String[] args)
			{
				Introduction.introduce();
				Introduction.choosePartners();
				Deck.getShuffledDeck();
				Deck.dealDeck();
//				for (Card fred : Deck.playerHand)
//					{
//						if (!fred.isSS() && !fred.isOO())
//							{
//								System.out.println((fred).getRank() +"/" + fred.getSuit());
//							}
//						else if (fred.isSS())
//							{
//								System.out.println("S/S");
//							}
//						else
//							{
//								System.out.println("0/0");
//							}
//						}
//				System.out.println();
//				for (Card george : Deck.pickup)
//					{
//						if (!george.isSS() && !george.isOO())
//							{
//								System.out.println((george).getRank() +"/" + george.getSuit());
//							}
//						else if (george.isSS())
//							{
//								System.out.println("S/S");
//							}
//						else
//							{
//								System.out.println("0/0");
//							}
//					}
			}
	
	}
