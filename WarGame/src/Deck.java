import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public List<Card> deck;

	public Deck() {
		deck = new ArrayList<>();
		String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
		String[] names = {"Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		int[] value = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
		
		for(String suit: suits) {
			for (int i = 0; i < names.length; i++) {
				deck.add(new Card(names[i], suit, value[i]));
			}
		}
		
	}
		public List<Card> getDeck() {
		return deck;
	}
		public void setCards(List<Card> deck) {
		this.deck = deck;
	}
		public void describe() {
		int index = 0;
		for (Card card : deck) {
			System.out.println((index++ +1) + ": " + card.toString());
			}
		}
		
		public void shuffle() {
			Collections.shuffle(deck);
		}
		
		public Card draw() {
			
			if (deck.size() > 0) {
				return deck.remove(0);
			} else {
				return null;
			}
			
		}
		public int size() {
			return deck.size();
		}
		
	}

