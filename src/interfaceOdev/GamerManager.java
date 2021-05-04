package interfaceOdev;

public class GamerManager extends EdevletEntry implements Authentication {

	public GamerManager(String name, String surname, String kimlikNumarasý) {
		super(name, surname, kimlikNumarasý);
		// TODO Auto-generated constructor stub
	}

	public void gamerShowInformation(Gamer gamer) {
		System.out.println("Girdiðiniz bilgiler...");
		System.out.println("Oyuncu ismi: " + gamer.getFirsName() + "\n" + "Oyuncu þifresi: " + gamer.getPassword()
				+ "\n" + "Oyuncu emaili: " + gamer.getEmail() + "\n" + "Oyuncu fps: " + gamer.getFps() + "\n"
				+ "Oyuncu ekran kartý: " + gamer.getDisplayCard());
	}

	public void gamerverification(Gamer gamer) {
		if (gamer.getFirsName() == "Rip" && gamer.getPassword() == "Rip123" && gamer.getEmail() == "rip@icloud.com") {
			System.out.print("Kimlik doðrulamasý baþarýlý Sisteme hoþ geldiniz: ");

		} else {
			System.out.println("Giriþ baþarýsýz.Lütfen Bilgilerinizi kontrol ediniz...");

		}

	}

	@Override
	public void idVerification(EdevletEntry edevletEntry) {
		System.out.println("***** Edevlet giriþ kontrolü *****\n\n");
		if (edevletEntry.getKimlikNumarasý() == "12345678912" && edevletEntry.getName() == "Ýsmail"
				&& edevletEntry.getSurname() == "Can") {

			System.out.println("------- DOÐRULAMA BAÞARILI -------");

			Registration registration = new Registration();
			registration.kayýtAdd(edevletEntry);
		} else {
			System.out.println("------- DOÐRULAMA BAÞARISIZ. LÜTFEN BÝLGÝLERÝNÝZÝ KONTROL EDÝNÝZ -------");
		}

	}

}
