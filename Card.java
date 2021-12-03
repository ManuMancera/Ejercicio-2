package ejercicio2;

public class Card {

	public String suit;
	public String value;
	
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	//Representa los datos en la Lista de DesckCards.java
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}