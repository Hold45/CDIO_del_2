public class TheWerewall extends GameSpace{

	TheWerewall(){
		super(DiceGui.getString("THEWEREWALLNAME"), DiceGui.getString("THEWEREWALLDESC"));
	}

	public void onLand(Player player){
		super.onLand(player, "THEWEREWALLONLAND");
		player.takeMoney(80);
		player.getGame().addExtraTurn(player);
	}
	
}