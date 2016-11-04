public class ColdDesert extends GameSpace{

	ColdDesert(){
		super(DiceGui.getString("COLDDESERTNAME"), DiceGui.getString("COLDDESERTDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "COLDDESERTONLAND");
		player.takeMoney(20);
	}
	
}