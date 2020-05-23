import java.util.List;
import java.util.Map;

public class OrchestratorImpl implements Orchestrator{
    public OrchestratorImpl() {
    }

    @Override
    public List<String> getinput(String jsonInputString) {
        return null;
    }

    @Override
    public Map<String, Integer> getPLZinput(String jsonstringPLZ) {
        return null;
    }

    @Override
    public Map<String, Double> getTimeinput(String jsonstringStr) {
        return null;
    }

    @Override
    public Map<String, Double> getRadiusinput(String jsonstringRadius) {
        return null;
    }

    @Override
    public Map<String, String> getStrinput(String jsonstringETA) {
        return null;
    }

    @Override
    public Map<String, Double> getoutput(Map<String, Integer> plz, Map<String, Double> t, Map<String, Double> r, Map<String, String> str) {
        return null;
    }

    public static void main(String[] args) {

    }
}
