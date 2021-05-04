package interfaceOdev;

public class GamerManager extends EdevletEntry implements Authentication {

	public GamerManager(String name, String surname, String kimlikNumaras�) {
		super(name, surname, kimlikNumaras�);
		// TODO Auto-generated constructor stub
	}

	public void gamerShowInformation(Gamer gamer) {
		System.out.println("Girdi�iniz bilgiler...");
		System.out.println("Oyuncu ismi: " + gamer.getFirsName() + "\n" + "Oyuncu �ifresi: " + gamer.getPassword()
				+ "\n" + "Oyuncu emaili: " + gamer.getEmail() + "\n" + "Oyuncu fps: " + gamer.getFps() + "\n"
				+ "Oyuncu ekran kart�: " + gamer.getDisplayCard());
	}

	public void gamerverification(Gamer gamer) {
		if (gamer.getFirsName() == "Rip" && gamer.getPassword() == "Rip123" && gamer.getEmail() == "rip@icloud.com") {
			System.out.print("Kimlik do�rulamas� ba�ar�l� Sisteme ho� geldiniz: ");

		} else {
			System.out.println("Giri� ba�ar�s�z.L�tfen Bilgilerinizi kontrol ediniz...");

		}

	}

	@Override
	public void idVerification(EdevletEntry edevletEntry) {
		System.out.println("***** Edevlet giri� kontrol� *****\n\n");
		if (edevletEntry.getKimlikNumaras�() == "12345678912" && edevletEntry.getName() == "�smail"
				&& edevletEntry.getSurname() == "Can") {

			System.out.println("------- DO�RULAMA BA�ARILI -------");

			Registration registration = new Registration();
			registration.kay�tAdd(edevletEntry);
		} else {
			System.out.println("------- DO�RULAMA BA�ARISIZ. L�TFEN B�LG�LER�N�Z� KONTROL ED�N�Z -------");
		}

	}

}
