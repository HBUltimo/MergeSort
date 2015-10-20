public class DiceRoller 
{
	public static int rollDice(String diceString)
	{
		int quantity = stringToInt(diceString.substring(0, diceString.indexOf('d')));
		System.out.println("The quantity is" + " " + quantity);
		int sides = stringToInt(diceString.substring(diceString.indexOf('d') + 1, diceString.indexOf('+')));
		System.out.println("How many sides?" + " " + sides);
		int answer = 0;
		Dice d = new Dice(sides);
		for(int i = 0; i < quantity; i++)
		{
			answer = answer + d.roll();
		}
		System.out.println("This is the final answer:" + answer);
		return answer;
	}
	
	static int stringToInt(String s)
	{
		int place = 1;
		int total = 0;
		for(int i = s.length()-1; i >= 0; i--)
		{
			total = total + (DiceRoller.charToInt(s.charAt(i)) * place);
			place *=10;
		}
		return total;
	}
	
	static int charToInt(char c)
	{
		String theDigits = "0123456789";
		return theDigits.indexOf(c);
	}
	
	
}