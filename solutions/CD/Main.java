import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        // BufferedReader for effective input reading
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        while(true){

            String line = input.readLine();
            String[] parts = line.split(" "); 

            int nJack = Integer.parseInt(parts[0]);
            int nJill = Integer.parseInt(parts[1]);

            if(nJack == 0 && nJill == 0){
                break;
            }

            int soldCDs = 0;

            HashMap<Integer, Integer> storageCD = new HashMap<>();

            for (int i = 0; i < nJack; i++) {
                int cd = Integer.parseInt(input.readLine());
                storageCD.put(cd, 1);
            }

            for (int i = 0; i < nJill; i++) {
                int cd = Integer.parseInt(input.readLine());

                if(storageCD.containsKey(cd)){
                    soldCDs++;
                }

            }

            System.out.println(soldCDs);
        }
    }
}
