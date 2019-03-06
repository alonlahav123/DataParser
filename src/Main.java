import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author Alon Lahav
 */
public class Main {
    public static void main(String[] args) {
        // test of utils

        String data = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        //System.out.println(data);

        ArrayList<ElectionResult> results = Utils.parse2016ElectionResults(data);

        for(int i = 0; i < results.size(); i++) {
            System.out.println(i + " ------> 5" + results.get(i));
        }
    }
}
