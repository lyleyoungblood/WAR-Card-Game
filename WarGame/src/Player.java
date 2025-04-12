import java.util.ArrayList;
import java.util.List;

public class Player {
	String name = "";
	List<Card> hand = new ArrayList<>();
	int score = 0;

	
	public Player (String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<>();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	  public int getScore() {
	return score;
}
  public void describe() {
	  System.out.println(name);
	  for (Card card : hand) {
		  card.describe();
		  System.out.println(" ");
	  }
  }
  
  public Card draw(Deck deck) {
	 Card drawnCard = deck.draw();
	 if (drawnCard != null) {
		 hand.add(drawnCard);
	 }
	 return drawnCard;
  }
  
  public Card flip() {
	  if (!hand.isEmpty()) {
		   return hand.remove(0);
		 
	  } else {
		  return null;
	  }
  }
  public static void finalScore(Player player1, Player player2) {
	  System.out.println("-------Scoreboard-------\n" + player1.getName() + ": " + player1.getScore() + "\n" + player2.getName() + ": " + player2.getScore());
		 if (player1.getScore() > player2.getScore()) {
			 System.out.println(player1.getName() + " wins!");
		 } else if (player1.getScore() == player2.getScore()) {
			 System.out.println("The game is a tie.");
		 } else {
			 System.out.println(player2.getName() + " wins!");
		 }
		 System.out.println("-------Scoreboard-------");
  }
  


public void incrementScore() {
	  score += 1;
  }
	
	
	
}
