import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private ArrayList<State> states;

    public  DataManager(ArrayList<ElectionResult> elecResults, ArrayList<EducationResult> educResults, ArrayList<UnemploymentResult> unempResults) {
        for(int i = 0; i < elecResults.size(); i++) {
            String state = elecResults.get(i).getState_abbr();

            if(states.indexOf(state) == -1) {

            }
        }
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }
}
