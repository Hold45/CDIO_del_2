public class PalaceGates extends GameSpace{

	PalaceGates(){
		super(DiceGui.getString("PALACEGATESNAME"), DiceGui.getString("PALACEGATESDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "PALACEGATESONLAND");
		player.addMoney(100);
	}
	
}