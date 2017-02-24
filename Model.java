import java.util.HashMap;


public class Model {

    private HashMap<String, Integer> sportMap = new HashMap<String, Integer>();

    public Model(){

        sportMap.put("VolleyBall", 0);
        sportMap.put("FootBall", 0);
        sportMap.put("BasketBall", 0);
    }

    public void putInMap(String sport, Integer number){

        sportMap.replace(sport, number);
    }

    public Integer getAmount(String sport){

        Integer sportNumber = sportMap.get(sport);
        return sportNumber;
    }

    public HashMap getMap(){
        return sportMap;
    }
}