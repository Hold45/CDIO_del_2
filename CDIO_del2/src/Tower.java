public class Tower extends GameSpace{

	Tower(){
		super(DiceGui.getString("TOWERNAME"), DiceGui.getString("TOWERDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "TOWERONLAND");
		player.addMoney(250);
	}
	
}