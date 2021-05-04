package interfaceOdev;

public class GameManager {

	public void sales(Game game) { 
		System.out.println("\n\n\n\n******SATIN ALMA ÝÞLERMLERÝ*****");
		System.out.println("100 tl ve üzeri alýþveriþte %20 indirim yapýlcaktýr.Bilginize...");
		System.out.println(game.getFirsName() + " adlý kullanýcý " + game.getGame() + " oyununu satýn adlý");
		System.out.println("Ürün fiyatý: " + game.getPrice());

		if (game.getPrice() >= 100) {

			System.out.println("Ýndirim sonrasý fiyat: " + game.getDiscount());

		}

	}

}
