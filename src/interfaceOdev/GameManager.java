package interfaceOdev;

public class GameManager {

	public void sales(Game game) { 
		System.out.println("\n\n\n\n******SATIN ALMA ��LERMLER�*****");
		System.out.println("100 tl ve �zeri al��veri�te %20 indirim yap�lcakt�r.Bilginize...");
		System.out.println(game.getFirsName() + " adl� kullan�c� " + game.getGame() + " oyununu sat�n adl�");
		System.out.println("�r�n fiyat�: " + game.getPrice());

		if (game.getPrice() >= 100) {

			System.out.println("�ndirim sonras� fiyat: " + game.getDiscount());

		}

	}

}
