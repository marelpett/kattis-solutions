import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int numberOfCases = reader.nextInt();

        List<Integer[]> casesList = new ArrayList<>();              // ArrayList to store all test cases in separate Integer Arrays
        Integer[] minimalDistances = new Integer[numberOfCases];    // Integer Array to store minimal distances of each case

        // Read input
        for (int i = 0; i < numberOfCases; i++){
            int numberOfStores = reader.nextInt();

            Integer[] storePositions = new Integer[numberOfStores];
            
            for(int j = 0; j < numberOfStores; j++){
                storePositions[j] = reader.nextInt();
            }

            Arrays.sort(storePositions);

            casesList.add(storePositions);

        }

        // Calculate the minimal distances
        for (int i = 0; i < casesList.size(); i++) {
            Integer[] storePositions = casesList.get(i);

            int min = storePositions[0];
            int max = storePositions[storePositions.length - 1];
            int minimalDistance = (max - min) * 2;

            minimalDistances[i] = minimalDistance;
        }

        for (int distance : minimalDistances) {
            System.out.println(distance);
        }
        
    }
}
