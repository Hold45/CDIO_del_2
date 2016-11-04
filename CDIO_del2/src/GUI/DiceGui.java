package GUI;

import Game.*;
import Player.Player;
import desktop_fields.*;
import desktop_resources.*;

import java.util.*;

import desktop_codebehind.Car;

import java.awt.Color;

public class DiceGui implements ImplementsGame{

	public static ResourceBundle labels = ResourceBundle.getBundle("LabelsBundle", Locale.getDefault());
	private static Game game;
	private static List<Field> fields = new ArrayList<>();
	
	public static void main(String[] args){

		DiceGui.game = new Game(new DiceGui());

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

	public String getString(String key){
		return DiceGui.labels.getString(key);
	}

	public void addField(String title, String description){
		Field space = new SpaceType.Builder().build();
		space.setTitle(title);
		space.setDescription(description);
		DiceGui.fields.add(space);
	}

	public String getString(String key, Player player){
		return DiceGui.labels.getString(key).replace("@", player.getName());
	}
	private static void createBoard(Game game){
		int tempSize = 40-DiceGui.fields.size();
		for (int i = 0; i< tempSize; i++){
			DiceGui.fields.add(new Empty.Builder().build());
		}

		Field[] fields = new Field[40];
		fields = DiceGui.fields.toArray(fields);
		GUI.create(fields);
	}
	public void updateUI(){
		int[] r = DiceGui.game.getCup().getValues();
		GUI.setDice(r[0], r[1]);
		for (Player player : DiceGui.game.getPlayers()){
			GUI.removeAllCars(player.getName());
			GUI.setCar(player.getPosition()+1, player.getName());
			GUI.setBalance(player.getName(), player.getMoney());
		}
		GUI.showMessage(game.getMessage());
	}
}
