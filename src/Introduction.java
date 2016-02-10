import java.util.Scanner;
public class Introduction
	{
		static String playerOneName = "";
		static String playerTwoName = "";
		static String playerThreeName = "";
		static String playerFourName = "";
		public static void introduce()
		{
			System.out.println("Hello and welcome to Somerset. Do you have four players playing today?");
			Scanner userInput = new Scanner (System.in);
			String response = userInput.nextLine();
			if (response.equals("no") || response.equals("No") || response.equals("NO"))
				{
					System.out.println("I'm sorry, but unfortunately this is a four player game.");
					System.out.println("Run this program again when you have found four players.");
					System.exit(0);
				}
			System.out.println("That's great news!");
			System.out.println("What is the first player's name?");
			playerOneName = userInput.nextLine();
			Scanner userIn = new Scanner (System.in);
			System.out.println("Welcome " + playerOneName + "!");
			System.out.println("What is the second player's name?");
			String playerTwoName = userIn.nextLine();
			
			System.out.println("Welcome " + playerTwoName + "!");
			System.out.println("What is the third player's name?");
			String playerThreeName = userInput.nextLine();
			System.out.println("Welcome " + playerThreeName + "!"); 
			System.out.println("What is the fourth player's name?");
			String playerFourName = userInput.nextLine();
			System.out.println("Welcome " + playerFourName + "!");
			
		}
		
		public static void choosePartners()
		{
			Scanner userResponse = new Scanner (System.in);
			System.out.println("Now you will choose your partners.");
			System.out.println("1)" + getPlayerOneName() + " & " + getPlayerTwoName() + "    vs.    " + getPlayerThreeName() + " & " + getPlayerFourName());
			System.out.println("2)" + getPlayerOneName() + " & " + getPlayerThreeName() + "    vs.    " + getPlayerTwoName() + " & " + getPlayerFourName());
			System.out.println("3)" + playerOneName + " & " + playerFourName + "    vs.   " + playerTwoName + " & " + playerThreeName);
			System.out.println("Please choose the number that indicates the pairings you would like to play with.");
			int partners = userResponse.nextInt();
			if (partners == 1)
				{
					System.out.println(getPlayerOneName() + " & " + getPlayerTwoName() + " will play against " + getPlayerThreeName() + " & " + getPlayerFourName());
				}
			else if (partners == 2)
				{
					System.out.println(getPlayerOneName() + " & " + getPlayerThreeName() + " will play against " + getPlayerTwoName() + " & " + getPlayerFourName());
				}
			else if (partners == 3)
				{
					System.out.println(getPlayerOneName() + " & " + getPlayerFourName() + "will play against" + getPlayerTwoName() + " & " + getPlayerThreeName());
				}
		}

		public static String getPlayerOneName()
			{
				return playerOneName;
			}

		public void setPlayerOneName(String playerOneName)
			{
				this.playerOneName = playerOneName;
			}

		public static String getPlayerTwoName()
			{
				return playerTwoName;
			}

		public void setPlayerTwoName(String playerTwoName)
			{
				this.playerTwoName = playerTwoName;
			}

		public static String getPlayerThreeName()
			{
				return playerThreeName;
			}

		public void setPlayerThreeName(String playerThreeName)
			{
				this.playerThreeName = playerThreeName;
			}

		public static String getPlayerFourName()
			{
				return playerFourName;
			}

		public void setPlayerFourName(String playerFourName)
			{
				this.playerFourName = playerFourName;
			}
		
	}
