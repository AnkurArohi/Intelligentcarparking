import java.util.List;
import java.util.Map;

public interface Orchestrator{
    List<String> getinput(String jsonInputString);//after pressing start from ui //extracts the respective inout json strings
    Map<String,Integer> getPLZinput(String jsonstringPLZ);
    Map<String,Double> getTimeinput(String jsonstringStr);
    Map<String,Double> getRadiusinput(String jsonstringRadius);
    Map<String,String> getStrinput(String jsonstringETA);//
    //Here also call the getParkplatz by instantiating an object of ParkPlatzFinder
    //Hereafter the getProbability(Map) fn will be called inst. the python AI pipeline
    //Called lastly from main function of OrchestratorImpl
    Map<String,Double> getoutput(Map<String,Integer> plz, Map<String,Double>t,Map<String,Double> r ,Map<String,String> str );

}
