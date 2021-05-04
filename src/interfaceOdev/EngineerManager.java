package interfaceOdev;

public class EngineerManager extends EdevletEntry implements Authentication {

	
	public EngineerManager(String name, String surname, String kimlikNumaras�) {
		super(name, surname, kimlikNumaras�);
		
		// TODO Auto-generated constructor stub
	}

	public void EngineerrShowInformation(Engineer engineer) {

		System.out.println("Oyuncu ismi: " + engineer.getFirsName() + "\n" + "Oyuncu �ifresi: "
				+ engineer.getPassword() + "\n" + "Oyuncu emaili: " + engineer.getEmail() + "\n" + "Oyuncu tecr�besi : "
				+ engineer.getOyunTecr�besi());

	}

	public void engineerverification(Engineer engineer) {
		if (engineer.getFirsName() == "fahri" && engineer.getPassword() == "fahri123"
				&& engineer.getEmail() == "fahrimarull@icloud.com") {
			System.out.println("Kimlik do�rulamas� ba�ar�l� Sisteme ho� geldiniz: " + engineer.getFirsName());
			

		} else { 
			System.out.println("Giri� ba�ar�s�z.L�tfen Bilgilerinizi kontrol ediniz...");

		}

	}

	@Override
	public void idVerification(EdevletEntry edevletEntry) {
		System.out.println("\n\n\n\n***** Edevlet giri� kontrol� *****");
		if (edevletEntry.getKimlikNumaras�() == "12345678912" && edevletEntry.getName() == "Can"
				&& edevletEntry.getSurname() == "Marul") {

			System.out.println("------- DO�RULAMA BA�ARILI -------");
			Registration registration = new Registration();
			registration.kay�tAdd(edevletEntry);
		} else {
			System.out.println("------- DO�RULAMA BA�ARISIZ. L�TFEN B�LG�LER�N�Z� KONTROL ED�N�Z -------");
		}

	}

}
