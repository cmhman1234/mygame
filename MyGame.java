import java.util.Scanner;
import java.util.Arrays; 


public class MyGame
{
	public String sWeapon; 
	 Scanner keyboard=new Scanner(System.in);
	public static void main(String[]args)
	{	
		MyGame game= new MyGame();

		welcomeMessage();
		pressEnterToContinue();
		System.out.println(game.getName());
		System.out.println(game.getStyle());
		System.out.println(game.getStarted()); 
		 
	}

	private static void welcomeMessage()
	{
		System.out.println("Welcome to Obstruction");
		

	}

	private static void pressEnterToContinue()

	{
		System.out.println("Press enter to continue");

		try
		{
			System.in.read();
		}
		catch(Exception e)
		{}
		 
	}

		private  String getName()
		{
			System.out.println("What shall we call you?");
			String name = keyboard.next();
			return name; 
			
		}

		
		public String style;
		public String weapon;

		public String getStyle()
		{
			
			String swordsman= "Swordsman";
			String archer= "Archer";
			String closeRange= "Close Range";
			String spearman= "Spearman";

			System.out.println("Choose your Style of fighting");
			System.out.println(swordsman);
			System.out.println(archer);
			System.out.println( closeRange);
			System.out.println(spearman);
			String style= keyboard.next();
	
				String[] sArray=
					{
						"Long Sword",
						"One hand Sword",
						"One hand long sword"
					};
			String[] aArray=
					{
						"Long bow",
						"Throwing knives",
						"Steel Bow"
					};
			String[] cArray=
					{
						"Pocket knife",
						"flail",
						"Brass knuckles"
					};

			String[] spArray=
					{
						"long spear",
						"throwing spear",
						"Short spear"
					};

			System.out.println("Choose a weapon");
			

						if(style.equalsIgnoreCase(swordsman))
					{
						System.out.println(Arrays.toString(sArray));
					}
					else if (style.equalsIgnoreCase(archer))
					{
						System.out.println(Arrays.toString(aArray));
					}
					else if(style.equalsIgnoreCase(closeRange))
					{
						System.out.println(Arrays.toString(cArray));
					}
					else if(style.equalsIgnoreCase(spearman))
					{
						System.out.println(Arrays.toString(spArray));
					}
						System.out.println("What weapon do you choose?");
						String weapon= keyboard.next();

						return weapon; 
				
						
		}
			
		public  void getStarted(String weapon)
		{	
			System.out.println("Good choice. A " + " " + sWeapon + " " + "will help you on our journey");
		}
		
		

	

}