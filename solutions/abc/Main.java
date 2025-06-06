import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * This program rearranges input numbers after the order of the input letters.
 * A is less than B, B is less than C.
 */

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] numbers = new int[3];

        HashMap<Character, Integer> numberOrder = new HashMap<>();
        
        for (int i = 0; i < 3; i++) {
            numbers[i] = reader.nextInt();
        }

        Arrays.sort(numbers);

        char[] letters = {'A', 'B', 'C'};

        for (int i = 0; i < 3; i++) {
            numberOrder.put(letters[i], numbers[i]);
        }

        reader.nextLine();
        String characterOrder = reader.nextLine();

        for (int i = 0; i < 3; i++) {

            char c = characterOrder.charAt(i);
            System.out.print(numberOrder.get(c));

            if(i<2){
                System.out.print(" ");
            }
        }
    }
}
