
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		deck.shuffle();
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
			
		}
		for (int i = 0; i < 13; i++) {
			Card p1Flip = player1.flip();
			Card p2Flip = player2.flip();
			if (p1Flip != null) {
				System.out.println(player1.getName() + " flipped " + p1Flip); 
			}
			if (p2Flip != null) {
				System.out.println(player2.getName() + " flipped " + p2Flip); 
			}
			if (p1Flip.getValue() > p2Flip.getValue()) {
				player1.incrementScore();
				System.out.println(player1.getName() + " has the higher value. +1 point " + "\n---Score--- \n" + player1.getName() + ": " + player1.getScore() + "\n" +player2.getName() + ": " +player2.getScore());
			} else if (p1Flip.getValue() == p2Flip.getValue()) {
				System.out.println("||Round Tie|| " + "\n---Score--- \n" + player1.getName() + ": " + player1.getScore() + "\n" +player2.getName() + ": " +player2.getScore());
			} else { player2.incrementScore();
			System.out.println(player2.getName() + " has the higher value. +1 point.  " + "\n---Score--- \n" + player1.getName() + ": " + player1.getScore() + "\n" +player2.getName() + ": " +player2.getScore());
			}
	} Player.finalScore(player1, player2);

}
}