package duplicated_code.example_2;

import duplicated_code.example_1.EngineerNotFoundException;

import java.util.Map;

public class CivilEngineer extends Engineer {


    public CivilEngineer(Map<String, String> engineerList) {
        super(engineerList);
    }

    String find() {
        for (Map.Entry<String, String> entry : engineerList.entrySet()) {
            if (entry.getKey().equals(getType())) {
                return entry.getValue();
            }
        }
        throw new EngineerNotFoundException(getType());
    }

    @Override
    public String getType() {
        return "Civil";
    }
}
