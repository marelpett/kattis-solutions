import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // ArrayList of Lists to store the times and distances of the photos
        List<List<Integer>> photoList = new ArrayList<>();
        
        int numberOfPhotos = reader.nextInt();

        // For loop iterates over number of photos to add to photoList
        for(int i = 0; i < numberOfPhotos; i++){

            List<Integer> photoData = new ArrayList<>();

            int t = reader.nextInt();
            int d = reader.nextInt();

            photoData.add(t);
            photoData.add(d);

            photoList.add(photoData);
        }

        // Define variables for calculations
        int tFirst = 0;
        int dFirst = 0;

        int tSecond = 0;
        int dSecond = 0;

        int tDifference = 0;
        int dDifference = 0;

        // Variables to keep track of speed and maximum calculated speed
        int speed = 0;
        int maxSpeed = 0;

        // Iterate over photoList to make calculations
        // Since first photo is always taken at [0,0] we start with the next photo
        for(int i = 1; i < photoList.size(); i++){

            tSecond = photoList.get(i).getFirst();
            dSecond = photoList.get(i).getLast();

            tDifference = tSecond - tFirst;
            dDifference = dSecond - dFirst;

            speed = dDifference/tDifference;

            if(speed > maxSpeed){
                maxSpeed = speed;
            }

            tFirst = tSecond;
            dFirst = dSecond;
            
        }

        System.out.println(maxSpeed);
    }
}
