import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/* 
 * Solution to the Kattis problem "Poker Hand". 
 * The program is given 5 cards and computes the strength of the hand.
 */

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // HashMap to store cards [A123456789TJQK]
        HashMap<Integer, HashSet<Character>> cardMap = new HashMap<>();

        String line = reader.nextLine(); // 
        String[] cards = line.split(" "); 
        
        for (String card : cards) {

        // Extract the card value
        char firstChar = card.charAt(0);
        int cardValue;

        switch(firstChar){
            case 'A' -> cardValue = 1;
            case 'T' -> cardValue = 10;
            case 'J' -> cardValue = 11;
            case 'Q' -> cardValue = 12;
            case 'K' -> cardValue = 13;
            default  -> cardValue = firstChar - '0';}

            // Extract the suit of the card
            char cardSuit = card.charAt(1);

            // HashSet to store the suits of the card value
            HashSet<Character> setOfSuits = new HashSet<>();

            cardMap.putIfAbsent(cardValue, setOfSuits);

            cardMap.get(cardValue).add(cardSuit);
        }

        // Integer to keep track of the latest maximum amount of suits
        int maxAmountOfSuits = 0;

        // Iterate the HashMap to find the maximum amount of suits
        for (var cardEntry : cardMap.entrySet()) {
            int size = cardEntry.getValue().size();
            if (size > maxAmountOfSuits) {
                maxAmountOfSuits = size;
            }
        }

        // Print strength of hand
        System.out.println(maxAmountOfSuits);
        reader.close();

    }
}