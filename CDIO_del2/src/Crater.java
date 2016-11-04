public class Crater extends GameSpace{

	Crater(){
		super(DiceGui.getString("CRATERNAME"), DiceGui.getString("CRATERDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "CRATERONLAND");
		player.takeMoney(100);
	}
	
}