import java.util.HashMap;


public class Controller{

    public Model model = new Model();
    String sport;
    Integer newSportNumber;

    public void findSport(Integer input){

        switch (input) {

            case (1):
                sport = "VolleyBall";
                break;
            case (2):
                sport = "FootBall";
                break;
            case (3):
                sport = "Basketball";
                break;
        }
    }

    public HashMap getSportMap(){
        return model.getMap();
    }

    public void findSportToAdd(Integer input3) {

        newSportNumber = model.getAmount(sport) + input3;
        model.putInMap(sport, newSportNumber);
    }

    public void findsportToDiscard(Integer input5) {

        newSportNumber = model.getAmount(sport) - input5;
        model.putInMap(sport, newSportNumber);
    }
}