public class Monastery extends GameSpace{

	Monastery(){
		super(DiceGui.getString("MONASTERYNAME"), DiceGui.getString("MONASTERYNAME"));
	}

	public void onLand(Player player){
		super.onLand(player, "MONASTERYONLAND");
		player.setMoney(0);
	}
	
}