import java.util.Scanner;


public class View {

    public static void main(String[] args){

        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);

        for (boolean i = true; i; ) {

            System.out.println("What Sports do you LIKE" +
                    "1 = How many sports do you play" +
                    "2 = Play more sports" +
                    "3 = Stop playing sport" +
                    "4 = Exit");

            Integer input = scanner.nextInt();

            switch (input){

                case (1):
                    //should print map that's in Model
                    System.out.println(controller.getSportMap());
                    break;

                case (2):
                    //ask which sports would like to add
                    System.out.println(" How many sports do you play" +
                            "1 = VolleyBall" +
                            "2 = FootBall" +
                            "3 = BasketBall");

                    Integer input2 = scanner.nextInt();
                    controller.findSport(input2);

                    //gets number user would like to add
                    System.out.println("What sports would you like to play");

                    Integer input3 = scanner.nextInt();

                    //Adding a sport
                    controller.findSportToAdd(input3);

                    System.out.println(" You Added " + input3 + ".");
                    break;

                case (3):
                    //ask which sport yo don't want to play anymore
                    System.out.println(" What sport do you want to drop" +
                            "1 = VolleyBall" +
                            "2 = FootBall" +
                            "3 = BasketBall");

                    Integer input4 = scanner.nextInt();
                    controller.findFruit(input4);

                    //gets number user would like to discard
                    System.out.println(" Drop this ");

                    Integer input5 = scanner.nextInt();

                    //stops playing sport
                    controller.findSportToDiscard(input5);

                    System.out.println(" You Dropped " + input4 + ".");
                    break;

                default:
                    i=false;
                    break;
            }
        }
    }}