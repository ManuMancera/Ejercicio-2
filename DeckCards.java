package ejercicio2;
//Importa las librerías.
import java.util.ArrayList;
//Declara la clase publica "DeckCards".
public class DeckCards {
	
	public static void main(String[] args) {
		
		//Declara las variables tipo String a los palos(suits) y los valores(values) de una baraja de cartas inglesa.
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		
		//Lista los resultados en una lista llamada "deck"
		ArrayList<Card> deck = new ArrayList<Card>();
		
		//Crea Cartas
		//Crea todas las covinaciones posibles con los palos y los valores de las variables.
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < values.length; j++) {
				Card card = new Card(suits[i], values[j]);
				deck.add(card);
			}
		}
		
		//Elige una carta aleatoria
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i);
			Card tmp = deck.get(i);
			deck.set(i, deck.get(j));
			deck.set(j, tmp);
		}
		
		//Escribe 5 lineas en la Lista deck que ya está creada con las cartas seleccionadas.
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i));
		}

	}

}