import java.util.Map;

public class OrchestratorImpl implements Orchestrator{
    public OrchestratorImpl() {
    }

    @Override
    public Map<String, Object> getInput(String jsonInputString) {
        return null;
    }

    @Override
    public Map<String, Double> getOutput(Map<String, Parkplatz> strasseWithProbs) {
        return null;
    }

    public static void main(String[] args) {
        Parkplatz parkPlatz = new Parkplatz("Sophienstr",26121,450);
        parkPlatz.setCost(2.5);
        System.out.println("Parkplatz capacity: "+parkPlatz.getCapacity());
        System.out.println("Parkplatz Name: "+parkPlatz.getName());
    }
}
