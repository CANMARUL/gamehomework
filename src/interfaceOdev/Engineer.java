package interfaceOdev;

public class Engineer extends User{

	private String oyunTecrübesi;
	public Engineer(String firsName, String password, String email,String oyunTecrübesi) {
		super(firsName, password, email);
		this.oyunTecrübesi=oyunTecrübesi;
		
	}
	public String getOyunTecrübesi() {
		return oyunTecrübesi;
	}
	public void setOyunTecrübesi(String oyunTecrübesi) {
		this.oyunTecrübesi = oyunTecrübesi;
	}
	

}
