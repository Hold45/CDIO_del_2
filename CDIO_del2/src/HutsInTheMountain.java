public class HutsInTheMountain extends GameSpace{

	HutsInTheMountain(){
		super(DiceGui.getString("HUTSINTHEMOUNTAINNAME"), DiceGui.getString("HUTSINTHEMOUNTAINDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "HUTSINTHEMOUNTAINONLAND");
		player.addMoney(60);
	}
	
}