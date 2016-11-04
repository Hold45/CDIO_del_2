package Game;

import Die.D6;
import Die.DiceCup;
import Field.*;
import GUI.ImplementsGame;
import Player.Player;

import java.util.Arrays;
import java.util.Stack;

public class Game{
	
	private Player[] players;
	private Player winner = null;
	private boolean playing;
	private GameSpace[] gameSpaces;
	private final DiceCup cup = new DiceCup(new D6[]{new D6(), new D6()});
	private Stack<Player> extraTurns = new Stack<Player>();
	private ImplementsGame gui;
	private String message = "";
	
	public Game(ImplementsGame gui){
		this.gui = gui;
		setGameSpaces(
			new GameSpace[]{
				new Tower(this),
				new Crater(this),
				new PalaceGates(this),
				new ColdDesert(this),
				new WalledCity(this),
				new Monastery(this),
				new BlackCave(this),
				new HutsInTheMountain(this),
				new TheWerewall(this),
				new ThePit(this),
				new Goldmine(this)
			}
		);
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
			this.addMessage(this.gui.getString("WIN", this.winner));
		}
		playing = false;
	}

	public String getString(String key){
		return this.gui.getString(key);
	}
	public String getString(String key, Player player){
		return this.gui.getString(key).replace("@", player.getName());
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
		gui.updateUI();
		while (this.extraTurns.size()>0){
			takeTurn(this.extraTurns.pop());
		}
	}

	public Game addMessage(String message){
		this.message += message;
		return this;
	}

	public String getMessage(){
		String tempMessage = this.message;
		this.message = "";
		return tempMessage;
	}

	public ImplementsGame getGUI() {
		return this.gui;
	}
}
