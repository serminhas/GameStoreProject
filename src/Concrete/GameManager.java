package Concrete;

import Abstract.BaseServiceManager;
import Entities.Game;

public class GameManager implements BaseServiceManager<Game> {

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName() + " added.");
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println(game.getGameName() + " updated.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() + " deleted.");
		
	}

}
