import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int testCases = Integer.parseInt(reader.nextLine());

        for (int testCase = 0; testCase < testCases; testCase++) {
            int n = Integer.parseInt(reader.nextLine());
            String[] numbers = new String[n];
            for (int i = 0; i < n; i++) {
                numbers[i] = reader.nextLine();
            }

            Arrays.sort(numbers);
            boolean consistent = true;

            for (int j = 0; j < n - 1; j++) {
                if (numbers[j+1].startsWith(numbers[j])) {
                    consistent = false;
                    break;
                }
            }
            
            if(consistent == true){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}