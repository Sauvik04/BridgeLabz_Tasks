import java.util.*;

class Card {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

class Deck {
    private Card[] cards;
    private int index = 0;

    public Deck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        cards = new Card[52];
        int k = 0;

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards[k++] = new Card(suits[i], ranks[j]);
            }
        }
    }

    public void shuffle() {
        Random rand = new Random();

        for (int i = 0; i < cards.length; i++) {
            int j = rand.nextInt(cards.length);

            Card temp = cards[i];
            cards[i] = cards[j];
            cards[j] = temp;
        }
    }

    public Card draw() {
        return cards[index++];
    }
}

public class Day11Assignment4 {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Card[][] players = new Card[4][9];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                players[i][j] = deck.draw();
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1));
            for (int j = 0; j < 9; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }
}