import desktop_fields.*;
import desktop_resources.*;
import java.util.Locale;
import java.util.ResourceBundle;
import desktop_codebehind.Car;
import java.awt.Color;

public class DiceGui {

	public static ResourceBundle labels = ResourceBundle.getBundle("LabelsBundle", Locale.getDefault());
	private static String message = "";
	private static Game game;
	
	public static void main(String[] args){
		DiceGui.game = new Game();
		DiceGui.createBoard(game);
		Player[] players = {
			new Player(game, GUI.getUserString(DiceGui.labels.getString("REQUESTNAME1"))), 
			new Player(game, GUI.getUserString(DiceGui.labels.getString("REQUESTNAME2")))
		};
		GUI.addPlayer(
			players[0].getName(), players[0].getMoney(),
			new Car.Builder().primaryColor(Color.BLUE).secondaryColor(Color.CYAN).typeTractor().patternZebra().build()
		);
		GUI.addPlayer(
			players[1].getName(),
			players[1].getMoney(),
			new Car.Builder().primaryColor(Color.RED).secondaryColor(Color.YELLOW).typeUfo().patternDiagonalDualColor().build()
		);
		DiceGui.game.setPlayers(players);
		DiceGui.game.start();
	}
	public static String getString(String key){
		return DiceGui.labels.getString(key);
	}
	public static String getString(String key, Player player){
		return DiceGui.labels.getString(key).replace("@", player.getName());
	}
	private static void createBoard(Game game){
		GameSpace[] gameSpaces = {
			new Tower(),
			new Crater(),
			new PalaceGates(),
			new ColdDesert(),
			new WalledCity(),
			new Monastery(),
			new BlackCave(),
			new HutsInTheMountain(),
			new TheWerewall(),
			new ThePit(),
			new Goldmine()
		};
		Field[] fields = new Field[40];
		for (int i = 0; i < gameSpaces.length ; i++){
			fields[i] = gameSpaces[i].space;
		}
		for (int i = gameSpaces.length; i<fields.length; i++){
			fields[i] = new Empty.Builder().build();
		}
		GUI.create(fields);
		game.setGameSpaces(gameSpaces);
	}
	public static void addMessage(String message){
		DiceGui.message += '\n'+message;
	}
	public static void updateUI(){
		int[] r = DiceGui.game.getCup().getValues();
		GUI.setDice(r[0], r[1]);
		for (Player player : DiceGui.game.getPlayers()){
			GUI.removeAllCars(player.getName());
			GUI.setCar(player.getPosition()+1, player.getName());
			GUI.setBalance(player.getName(), player.getMoney());
		}
		GUI.showMessage(DiceGui.message);
		DiceGui.message = "";
	}
}
