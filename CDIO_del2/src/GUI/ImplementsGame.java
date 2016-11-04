package GUI;

import Player.Player;

public interface ImplementsGame {
	void updateUI();
	String getString(String key, Player player);
	String getString(String key);
	void addField(String title, String description);
}
