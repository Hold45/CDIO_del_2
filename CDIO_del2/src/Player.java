public class Player {
	
	private String name;
	private String color;
	private Account account;
	private Game game;
	private int position = 0;

	Player(){
		account = new Account(1000);
	}
	Player(Game game, String name){
		account = new Account(1000);
		this.game = game;
		this.name = name;
	}
	public int getPosition(){
		return position;
	}
	public int move(int value){
		this.position = (this.position+value)%this.game.getGameSpaces().length;
		this.game.getGameSpaces()[position].onLand(this);
		return this.position;
	}
	public Game getGame(){
		return this.game;
	}
	public Player(String name){
		this.name = name;
	}
	public int getMoney(){
		return account.getMoney();
	}
	public void addMoney(int value){
		this.account.addMoney(value);
		if (this.account.getMoney()>=3000){
			this.game.win(this);
		}
	}
	public void takeMoney(int value){
		if (!account.takeMoney(value)){
			this.game.lose(this);
		}
	}
	public void setMoney(int value){
		account.setMoney(value);
	}
	public String getName(){
		return name;
	}
	public void takeTurn(){
		move(game.getCup().roll());
	}
	
}
