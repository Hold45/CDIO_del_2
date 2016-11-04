package GUI;

import Player.Player;

public class DummyGUI implements ImplementsGame {

	@Override
	public void updateUI() {

	}

	@Override
	public String getString(String key, Player player) {
		return "";
	}

	@Override
	public String getString(String key) {
		return "";
	}

	@Override
	public void addField(String title, String description) {
	}
}