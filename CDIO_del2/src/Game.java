import java.util.Stack;

public class Game{
	
	private Player[] players;
	private Player winner = null;
	private boolean playing;
	private GameSpace[] gameSpaces;
	private final DiceCup cup = new DiceCup(new D6[]{new D6(), new D6()});
	private Stack<Player> extraTurns = new Stack<Player>();
	
	Game(){
	
	}
	public void addExtraTurn(Player player){
		this.extraTurns.add(player);
	}
	public Player[] getPlayers(){
		return this.players;
	}
	public DiceCup getCup(){
		return this.cup;
	}
	public void setGameSpaces(GameSpace[] gameSpaces){
		this.gameSpaces = gameSpaces;
	}
	public GameSpace[] getGameSpaces(){
		return this.gameSpaces;
	}
	public void setPlayers(Player[] players){
		this.players = players;
	}
	public void start(){
		playing = true;
		while (playing){
			round();
		}
	}
	private void round(){
		for (Player player : players){
			takeTurn(player);
		}
	}
	public void win(Player player){
		winner = player;
	}
	public void lose(Player player){
		for (Player p : players){
			if (player!=p){win(p);}
		}
	}
	public void endGame(){
		if (this.winner!=null){
			DiceGui.addMessage(DiceGui.getString("WIN", this.winner));
		}
		playing = false;
	}
	public boolean checkGameEnd(){
		if (winner!=null){
			endGame();
			return false;
		} else{
			return true;
		}
	}
	public void takeTurn(Player player){
		if (checkGameEnd()){ player.takeTurn();}
		DiceGui.updateUI();
		while (this.extraTurns.size()>0){
			takeTurn(this.extraTurns.pop());
		}
	}
}
