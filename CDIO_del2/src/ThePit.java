public class ThePit extends GameSpace{

	ThePit(){
		super(DiceGui.getString("THEPITNAME"), DiceGui.getString("THEPITDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "THEPITONLAND");
		player.takeMoney(50);
	}
	
}