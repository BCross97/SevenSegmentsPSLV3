import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PreProcessing {


    public ArrayList<String> numbers() {
        java.util.ArrayList<java.lang.String> numbers = new ArrayList();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        java.lang.String[] readings = new java.lang.String[3];
        System.out.println("Add the numbers you wish to process");
        try {
            readings[0] = br.readLine();
            readings[1] = br.readLine();
            readings[2] = br.readLine();


            for (int i = 0; i < readings[0].length(); i += 4) {

                java.lang.String top = readings[0].substring(i, i + 3);
                java.lang.String mid = readings[1].substring(i, i + 3);
                java.lang.String bot = readings[2].substring(i, i + 3);
                numbers.add(top + mid + bot);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return numbers;
    }
}
