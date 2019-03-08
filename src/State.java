import java.util.ArrayList;
import java.util.List;

public class State {
    private String name;
    private ArrayList<County> counties;

    public State(String name, ArrayList<County> counties) {
        name = name;
        counties = counties;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<County> getCounties() {
        return counties;
    }

    public void setCounties(ArrayList<County> counties) {
        this.counties = counties;
    }
}
