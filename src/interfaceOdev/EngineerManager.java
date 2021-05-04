package interfaceOdev;

public class EngineerManager extends EdevletEntry implements Authentication {

	
	public EngineerManager(String name, String surname, String kimlikNumarasý) {
		super(name, surname, kimlikNumarasý);
		
		// TODO Auto-generated constructor stub
	}

	public void EngineerrShowInformation(Engineer engineer) {

		System.out.println("Oyuncu ismi: " + engineer.getFirsName() + "\n" + "Oyuncu þifresi: "
				+ engineer.getPassword() + "\n" + "Oyuncu emaili: " + engineer.getEmail() + "\n" + "Oyuncu tecrübesi : "
				+ engineer.getOyunTecrübesi());

	}

	public void engineerverification(Engineer engineer) {
		if (engineer.getFirsName() == "fahri" && engineer.getPassword() == "fahri123"
				&& engineer.getEmail() == "fahrimarull@icloud.com") {
			System.out.println("Kimlik doðrulamasý baþarýlý Sisteme hoþ geldiniz: " + engineer.getFirsName());
			

		} else { 
			System.out.println("Giriþ baþarýsýz.Lütfen Bilgilerinizi kontrol ediniz...");

		}

	}

	@Override
	public void idVerification(EdevletEntry edevletEntry) {
		System.out.println("\n\n\n\n***** Edevlet giriþ kontrolü *****");
		if (edevletEntry.getKimlikNumarasý() == "12345678912" && edevletEntry.getName() == "Can"
				&& edevletEntry.getSurname() == "Marul") {

			System.out.println("------- DOÐRULAMA BAÞARILI -------");
			Registration registration = new Registration();
			registration.kayýtAdd(edevletEntry);
		} else {
			System.out.println("------- DOÐRULAMA BAÞARISIZ. LÜTFEN BÝLGÝLERÝNÝZÝ KONTROL EDÝNÝZ -------");
		}

	}

}
