
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		Player p1 = new Player("Player 1:");
		Player p2 = new Player("Player 2:");
		deck.shuffle();
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(deck);
			} else {
				p2.draw(deck);
			}
		}
		
		for (int i = 0; i < 26; i++) {
			Card p1Card = p1.flip();
			Card p2Card = p2.flip();
			if (p1Card.getValue() > p2Card.getValue()) {
				p1.incrementScore();
			} else if (p1Card.getValue() < p2Card.getValue()); {
			p2.incrementScore();
		}
	}
		
	System.out.println("Player 1 Score: " + p1.retrieveScore());
	System.out.println("Player 2 Score: " + p2.retrieveScore());
	if (p1.retrieveScore()  > p2.retrieveScore()) {
		System.out.println("Winner: Player 1");
	} else if (p1.retrieveScore() < p2.retrieveScore()) {
		System.out.println("Winner: Player 2");
	} else {
		System.out.println("Draw");
	}
		
		
		
	}

}
