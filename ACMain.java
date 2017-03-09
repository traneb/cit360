
public class ACMain {

    ApplicationController controller = new ApplicationController();

    public static void main(String[] args){

        ACMain ACMain = new ACMain();
        ACMain.controller.mapCommand("commandOne", new FirstCommandValue());
        ACMain.controller.mapCommand("commandTwo", new SecondCommandValue());
        ACMain.controller.mapCommand("commandThree", new ThirdCommandValue());

        ACMain.controller.handleRequest("commandOne", null);
        ACMain.controller.handleRequest("commandTwo", null);
        ACMain.controller.handleRequest("commandThree", null);

    }
}