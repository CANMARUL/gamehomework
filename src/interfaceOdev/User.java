package interfaceOdev;

public class User {
	private String firsName;
	private String password;
	private String email;
	
	public User(String firsName, String password, String email) {
		super();
		this.firsName = firsName;
		this.password = password;
		this.email = email;
	}
	
	public String getFirsName() {
		return firsName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	

}
