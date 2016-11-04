public abstract class GameSpace{

	protected SpaceType space;
	
	GameSpace(String title, String description){
		space = new SpaceType.Builder().build();
		space.setTitle(title);
		space.setDescription(description);
	}
	public void onLand(Player player){
	
	}
	public void onLand(Player player, String string){
		DiceGui.addMessage(DiceGui.getString(string));
	}
	
}

