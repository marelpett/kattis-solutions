import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfGuests = input.nextInt();

        // Array to store the seated guests and their language
        int[] guestLanguages = new int[numberOfGuests];

        for (int i = 0; i < numberOfGuests; i++){
            guestLanguages[i] = input.nextInt();
        }

        // HashMap to keep track on languages and their position
        HashMap<Integer, Integer> lastLanguage = new HashMap<>();

        // If no guests speak the same languages, max awkward level is number of guests
        int awkwardLevel = numberOfGuests; 

        for (int i = 0; i < guestLanguages.length; i++) {

            int currentLanguage = guestLanguages[i];

            // Check if the language of the current guest already has been seated
            if (lastLanguage.containsKey(currentLanguage)) {
                int previous = lastLanguage.get(currentLanguage);
                int distance = i - previous;

                if (distance < awkwardLevel) {
                    awkwardLevel = distance;
                }
            }

            // Save last position of the current language was seated
            lastLanguage.put(currentLanguage, i);
        }

        System.out.println(awkwardLevel);
    }
}