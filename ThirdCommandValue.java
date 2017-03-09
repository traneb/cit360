import java.util.HashMap;


public class ThirdCommandValue implements Handler{
    @Override
    public void handleIt(HashMap<String, Object> data) {
        System.out.println("The third command was called.");

    }
}