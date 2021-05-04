package interfaceOdev;

public class EdevletEntry {
	private String name;
	private String surname;
	private String kimlikNumarasý;
	
	public EdevletEntry(String name,String surname,String kimlikNumarasý) {
		this.kimlikNumarasý=kimlikNumarasý;
		this.name=name;
		this.surname=surname;
	}

	public String getName() {
		return name;
	}


	public String getSurname() {
		return surname;
	}

	public String getKimlikNumarasý() {
		return kimlikNumarasý;
	}

	
	
}
