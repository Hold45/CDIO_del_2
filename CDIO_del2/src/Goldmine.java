public class Goldmine extends GameSpace{

	Goldmine(){
		super(DiceGui.getString("GOLDMINENAME"), DiceGui.getString("GOLDMINEDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "GOLDMINEONLAND");
		player.addMoney(650);
	}
	
}