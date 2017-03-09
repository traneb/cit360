import java.util.HashMap;


public class FirstCommandValue implements Handler{


    @Override
    public void handleIt(HashMap<String, Object> data) {
        System.out.println("first command called.");

    }
}
