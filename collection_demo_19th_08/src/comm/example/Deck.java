package comm.example;

import java.util.ArrayList;
import java.util.List;

public class Deck {

	private static List<Card> protoDeck = new ArrayList<Card>();

	static {
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				protoDeck.add(new Card(s, r));
			}
		}
		System.out.println(protoDeck);

	}
	
	
	public static void main(String[] args)
	{
		
	}

}
