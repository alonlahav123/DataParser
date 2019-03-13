import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private ArrayList<State> states;

    public  DataManager(ArrayList<ElectionResult> elecResults, ArrayList<EducationResult> educResults, ArrayList<UnemploymentResult> unempResults) {
        states = new ArrayList<>();
        createAllStates(elecResults, educResults, unempResults);
        addElecData(elecResults);
        addEducData(educResults);
        addEmployData(unempResults);
        System.out.println("Dataset");
    }

    private void createAllStates(ArrayList<ElectionResult> elecResults, ArrayList<EducationResult> educResults, ArrayList<UnemploymentResult> unempResults) {
        for(int i = 0; i < elecResults.size(); i++) {
            String stateAbb = elecResults.get(i).getState_abbr();
            if(getStateIndex(stateAbb) == -1) {
                createNewState(stateAbb);
            }
        }

        for(int i = 0; i < educResults.size(); i++) {
            String stateAbb = educResults.get(i).getState_abbr();
            if(getStateIndex(stateAbb) == -1) {
                createNewState(stateAbb);
            }
        }

        for(int i = 0; i < unempResults.size(); i++) {
            String stateAbb = unempResults.get(i).getState_abbr();
            if(getStateIndex(stateAbb) == -1) {
                createNewState(stateAbb);
            }
        }
    }

    private void createNewState(String stateAbb) {
        State temp = new State(stateAbb);
        states.add(temp);
    }

    private void addElecData(ArrayList<ElectionResult> elecResults) {

        for(int i = 0; i < elecResults.size(); i++) {
            String state_abb = elecResults.get(i).getState_abbr();
            int index = getStateIndex(state_abb);
            states.get(index).addCountyElec(elecResults.get(i));

        }
    }

    private void addEducData(ArrayList<EducationResult> educResults) {

        for(int i = 0; i < educResults.size(); i++) {
            String state_abb = educResults.get(i).getState_abbr();
            int index = getStateIndex(state_abb);
            states.get(index).addCountyEduc(educResults.get(i));
        }
    }

    private void addEmployData(ArrayList<UnemploymentResult> employResults) {

        for(int i = 0; i < employResults.size(); i++) {
            String state_abb = employResults.get(i).getState_abbr();
            int index = getStateIndex(state_abb);
            states.get(index).addCountyEmploy(employResults.get(i));

        }
    }

    private int getStateIndex(String state_abb) {

        for(int i = 0; i < states.size(); i++) {
            if(state_abb.equals(states.get(i).getName())) {
                return i;
            }
        }

        return -1;
    }

    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }
}
