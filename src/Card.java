
public class Card
	{
		private int suit;
		private int rank;
		private boolean isDouble;
		private int points;
		private boolean isSS;
		private boolean isOO;
		
		public Card(int s, int r, boolean ID, int p, boolean SS, boolean OO)
		{
			suit=s;
			rank = r;
			isDouble = ID;
			points = p;
			isSS = SS;
			isOO = OO;
			
		}

		public int getSuit()
			{
				return suit;
			}

		public void setSuit(int suit)
			{
				this.suit = suit;
			}

		public int getRank()
			{
				return rank;
			}

		public void setRank(int rank)
			{
				this.rank = rank;
			}

		public boolean isDouble()
			{
				return isDouble;
			}

		public void setDouble(boolean isDouble)
			{
				this.isDouble = isDouble;
			}

		public int getPoints()
			{
				return points;
			}

		public void setPoints(int points)
			{
				this.points = points;
			}

		public boolean isSS()
			{
				return isSS;
			}

		public void setSS(boolean isSS)
			{
				this.isSS = isSS;
			}

		public boolean isOO()
			{
				return isOO;
			}

		public void setOO(boolean isOO)
			{
				this.isOO = isOO;
			}
		
	}
