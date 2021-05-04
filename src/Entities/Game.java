package Entities;

public class Game implements Entity{
 private int gameId;
 private String gameName;
 private double gamePrice;
 private double gamePriceAfterDiscount;
 
 public Game() {
	 
 }

public Game(int gameId, String gameName, double gamePrice, double gamePriceAfterDiscount) {
	super();
	this.gameId = gameId;
	this.gameName = gameName;
	this.gamePrice = gamePrice;
	this.gamePriceAfterDiscount = gamePriceAfterDiscount;
}

public int getGameId() {
	return gameId;
}

public void setGameId(int gameId) {
	this.gameId = gameId;
}

public String getGameName() {
	return gameName;
}

public void setGameName(String gameName) {
	this.gameName = gameName;
}

public double getGamePrice() {
	return gamePrice;
}

public void setGamePrice(double gamePrice) {
	this.gamePrice = gamePrice;
}

public double getGamePriceAfterDiscount() {
	return gamePriceAfterDiscount;
}

public void setGamePriceAfterDiscount(double gamePriceAfterDiscount) {
	this.gamePriceAfterDiscount = gamePriceAfterDiscount;
}
}
