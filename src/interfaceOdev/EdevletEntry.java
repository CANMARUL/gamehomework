package interfaceOdev;

public class EdevletEntry {
	private String name;
	private String surname;
	private String kimlikNumarası;
	
	public EdevletEntry(String name,String surname,String kimlikNumarası) {
		this.kimlikNumarası=kimlikNumarası;
		this.name=name;
		this.surname=surname;
	}

	public String getName() {
		return name;
	}


	public String getSurname() {
		return surname;
	}

	public String getKimlikNumarası() {
		return kimlikNumarası;
	}

	
	
}
