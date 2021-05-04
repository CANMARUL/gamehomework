package interfaceOdev;

public class Gamer extends User {
	private String fps;
	private String displayCard; 

	public Gamer(String firsName, String password, String email, String fps, String displayCard) {
		super(firsName, password, email);
		this.displayCard = displayCard;
		this.fps = fps;

	}

	public String getFps() {
		return fps;
	}

	public void setFps(String fps) {
		this.fps = fps;
	}

	public String getDisplayCard() {
		return displayCard;
	}

	public void setDisplayCard(String displayCard) {
		this.displayCard = displayCard;
	}
	
	

}
