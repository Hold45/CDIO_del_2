public class BlackCave extends GameSpace{

	BlackCave(){
		super(DiceGui.getString("BLACKCAVENAME"), DiceGui.getString("BLACKCAVEDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "BLACKCAVEONLAND");
		player.takeMoney(70);
	}
	
}