package Field;
import GUI.DiceGui;
import Player.Player;

public class BlackCave extends GameSpace {

	public BlackCave(){
		super(DiceGui.getString("BLACKCAVENAME"), DiceGui.getString("BLACKCAVEDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "BLACKCAVEONLAND");
		player.takeMoney(70);
	}
	
}