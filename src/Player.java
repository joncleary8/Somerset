
public class Player
	{
		private String playerName;
		private int playerNumber;
		private int playerTeamNumber;
		private int playerHand;
		public Player (String p,int pN, int pTN, int pH)
		{
			playerName = p;
			playerNumber = pN;
			playerTeamNumber = pTN;
			playerHand = pH;
		}
		
		public String getPlayerName()
			{
				return playerName;
			}

		public void setPlayerName(String playerName)
			{
				this.playerName = playerName;
			}

		public int getPlayerNumber()
			{
				return playerNumber;
			}
		public void setPlayerNumber(int playerNumber)
			{
				this.playerNumber = playerNumber;
			}
		public int getPlayerTeamNumber()
			{
				return playerTeamNumber;
			}
		public void setPlayerTeamNumber(int playerTeamNumber)
			{
				this.playerTeamNumber = playerTeamNumber;
			}

		public int getPlayerHand()
			{
				return playerHand;
			}

		public void setPlayerHand(int playerHand)
			{
				this.playerHand = playerHand;
			}
		
	}
