import java.util.ArrayList;
import java.util.Collections;

public class Deck
	{
		static ArrayList <Card> deck = new ArrayList<Card>();
		static ArrayList <Card> playerHand = new ArrayList<Card>();
		static ArrayList <Card> computerHand = new ArrayList<Card>();
		static ArrayList <Card> playerPartnerHand = new ArrayList<Card>();
		static ArrayList <Card> computerPartnerHand = new ArrayList<Card>();
		
		public static void getShuffledDeck()
		{
			deck.add(new Card(2, 0, false, 0, false, false));
			deck.add(new Card(2, 1,false, 1, false, false));
			deck.add(new Card(2, 2, true, 0, false, false));
			deck.add(new Card(4, 0, false, 0 ,false, false));
			deck.add(new Card(4, 1, false, 0 ,false, false));
			deck.add(new Card(4, 2, false, 1, false, false));
			deck.add(new Card(4, 3, false, 0 ,false, false));
			deck.add(new Card(4, 4, true, 0 ,false, false));
			deck.add(new Card(6, 0, false, 0 ,false, false));
			deck.add(new Card(6, 1, false, 0 ,false, false));
			deck.add(new Card(6, 2, false, 0 ,false, false));
			deck.add(new Card(6, 3, false, 1, false, false));
			deck.add(new Card(6, 4, false, 0 ,false, false));
			deck.add(new Card(6, 5, false, 0 ,false, false));
			deck.add(new Card(6, 6, false, 0 ,false, false));
			deck.add(new Card(8, 0, false, 0 ,false, false));
			deck.add(new Card(8, 1, false, 0 ,false, false));
			deck.add(new Card(8, 2, false, 0 ,false, false));
			deck.add(new Card(8, 3, false, 0 ,false, false));
			deck.add(new Card(8, 4, false, 2, false, false));
			deck.add(new Card(8, 5, false, 0 ,false, false));
			deck.add(new Card(8, 6, false, 0 ,false, false));
			deck.add(new Card(8, 7, false, 0 ,false, false));
			deck.add(new Card(8, 8, true, 0 ,false, false));
			deck.add(new Card(10, 0, false, 0 ,false, false));
			deck.add(new Card(10, 1, false, 0 ,false, false));
			deck.add(new Card(10, 2, false, 0 ,false, false));
			deck.add(new Card(10, 3, false, 0 ,false, false));
			deck.add(new Card(10, 4, false, 0 ,false, false));
			deck.add(new Card(10, 5, false, 2, false, false));
			deck.add(new Card(10, 6, false, 0 ,false, false));
			deck.add(new Card(10, 7, false, 0 ,false, false));
			deck.add(new Card(10, 8, false, 0 ,false, false));
			deck.add(new Card(10, 9, false, 0 ,false, false));
			deck.add(new Card(10, 10, true, 0 ,false, false));
			deck.add(new Card(12, 0, false, 0 ,false, false));
			deck.add(new Card(12, 1, false, 0 ,false, false));
			deck.add(new Card(12, 2, false, 0 ,false, false));
			deck.add(new Card(12, 3, false, 0 ,false, false));
			deck.add(new Card(12, 4, false, 0 ,false, false));
			deck.add(new Card(12, 5, false, 0 ,false, false));
			deck.add(new Card(12, 6, false, 2 ,false, false));
			deck.add(new Card(12, 7, false, 0 ,false, false));
			deck.add(new Card(12, 8, false, 0 ,false, false));
			deck.add(new Card(12, 9, false, 0 ,false, false));
			deck.add(new Card(12, 10, false, 0 ,false, false));
			deck.add(new Card(12, 11, false, 0 ,false, false));
			deck.add(new Card(12, 12, true, 0 ,false, false));
			Collections.shuffle(deck);
		}

		public static void dealDeck()
		{
			for (int i = 0; i<48; i++)
				{
					if (i%4 == 0)
						{
							playerHand.add(deck.get(i));
						}
					else if (i%4 == 1)
						{
							computerHand.add(deck.get(i));
						}
					else if (i%4 == 2)
						{
							playerPartnerHand.add(deck.get(i));
						}
					else if (i%4 == 3)
						{
							computerPartnerHand.add(deck.get(i));
						}
				}
			
		}
		public static ArrayList<Card> getDeck()
			{
				return deck;
			}
		public static void setDeck(ArrayList<Card> deck)
			{
				Deck.deck = deck;
			}

		public static ArrayList<Card> getPlayerHand()
			{
				return playerHand;
			}

		public static void setPlayerHand(ArrayList<Card> playerHand)
			{
				Deck.playerHand = playerHand;
			}

		public static ArrayList<Card> getComputerHand()
			{
				return computerHand;
			}

		public static void setComputerHand(ArrayList<Card> computerHand)
			{
				Deck.computerHand = computerHand;
			}

		public static ArrayList<Card> getPlayerPartnerHand()
			{
				return playerPartnerHand;
			}

		public static void setPlayerPartnerHand(ArrayList<Card> playerPartnerHand)
			{
				Deck.playerPartnerHand = playerPartnerHand;
			}

		public static ArrayList<Card> getComputerPartnerHand()
			{
				return computerPartnerHand;
			}

		public static void setComputerPartnerHand(ArrayList<Card> computerPartnerHand)
			{
				Deck.computerPartnerHand = computerPartnerHand;
			}
		
	}

