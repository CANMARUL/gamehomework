package interfaceOdev;

public class Engineer extends User{

	private String oyunTecr�besi;
	public Engineer(String firsName, String password, String email,String oyunTecr�besi) {
		super(firsName, password, email);
		this.oyunTecr�besi=oyunTecr�besi;
		
	}
	public String getOyunTecr�besi() {
		return oyunTecr�besi;
	}
	public void setOyunTecr�besi(String oyunTecr�besi) {
		this.oyunTecr�besi = oyunTecr�besi;
	}
	

}
