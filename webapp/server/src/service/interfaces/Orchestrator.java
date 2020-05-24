import java.util.Map;

public interface Orchestrator{

    Map<String, Object> getInput(String jsonInputString);

    //Here also call the getParkplatz(Strasse dest, Double radius) by instantiating an object of ParkPlatzFinder

    //Hereafter the getProbability(Map<String, Strasse>,  Integer eta) fn will be called inst. the python AI pipeline

    //Called lastly from main function of OrchestratorImpl
    Map<String, Double> getOutput(Map<String, Parkplatz> parkPlatzWithProbs);
}
