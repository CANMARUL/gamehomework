package interfaceOdev;

public class Main {

	public static void main(String args[]) {
 
		Gamer gamer = new Gamer("Rip", "Rip123", "rip@icloud.com", "300", "GTX1070");
		GamerManager gamerManager = new GamerManager("�smail", "Can", "12345678912");

		gamerManager.gamerverification(gamer);
		System.out.println("******************************************************");
		gamerManager.gamerShowInformation(gamer);
		System.out.println("******************************************************");
		gamerManager.idVerification(gamerManager);
		System.out.println("******************************************************");
		
		Engineer engineer = new Engineer("fahri", "fahri123", "fahrimarull@icloud.com", "�dare eder");
		EngineerManager engineerManager = new EngineerManager("Can", "Marul", "12345678912");
		
		

		engineerManager.EngineerrShowInformation(engineer);
		System.out.println("******************************************************");
		engineerManager.engineerverification(engineer);
		System.out.println("******************************************************");
		engineerManager.idVerification(engineerManager);
		System.out.println("******************************************************");
		
		
		
		Game game = new Game("Fahri", "fahri123", "fahrimarull@icloud.com","CS GO", 150);
		GameManager gameManager = new GameManager();
		gameManager.sales(game);
	
	}
}
