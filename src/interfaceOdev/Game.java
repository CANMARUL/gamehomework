package interfaceOdev;

public class Game extends User { 
	private String game;
	private int price;
	private int discount;
	public Game(String firsName, String password, String email,String game,int price) {
		super(firsName, password, email);
		this.game=game;
		this.price=price;
		
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		if(price>=100) {
			System.out.println("Ürününüz 100 tl nin üzerindedir Kampanyadan yararlanabilirsiniz...");
			return price-(price*20)/100;
			
		}
		return discount;
	}

	
	

}
