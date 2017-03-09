import java.util.HashMap;


public class SecondCommandValue implements Handler{
    @Override
    public void handleIt(HashMap<String, Object> data) {
        System.out.println("second command called.");

    }
}
