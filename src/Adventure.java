import java.util.Scanner;

public class Adventure{
    public static void main(String[] args) {


        Room room1 = new Room ("a plane.","You are about to jump out of the plane.");
        Room room2 = new Room ("falling.","You are currently falling with 200 mph, your childhood memories are replaying before your eyes. ");
        Room room3 = new Room ("dead.","You smashed a massive hole in the ground, you are dead.");
        Room room4 = new Room ("falling.","You are falling with 200mph, you are about to pull your parachute. ");
        Room room5 = new Room ("in a 7-eleven.","You bought a 6-pack of beers and a pack of cigarettes. Today has been a good day.");
        Room room6 = new Room ("hit by a magical light.","....You have resin from the dead.");
        Room room7 = new Room ("at Strøget.","You are flying safely above Copenhagen, and landing at the nice landing strip Strøget. ");
        Room room8 = new Room ("walking down the street.","People are yelling at you, but you dont care." );
        Room room9 = new Room ("at Storke springvandet.","Your washing the blood of your clothes, unfortunately you hit a family on the way down. ");


        room1.setEast(room2);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room7.setEast(room8);
        room8.setEast(room9);
        room9.setNorth(room6);
        room4.setSouth(room7);

        Room currenRoom = room1;

        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO THE ADVENTURE GAME!\n");
        System.out.println("THIS IS YOUR COMMANDS:");
        System.out.println("--------------------------------");
        System.out.println("Exit - Exit game\nHelp - Commands list\nLook - Repeats room description \nNorth / Go North / N - Player moves North\nSouth / Go South / S - Player moves South\nEast  / Go East  / E - Player moves East\nWest  / Go West  / W - Player moves West" );
        System.out.println("--------------------------------");

        System.out.println("\nYou are at a plane. You are about to jump out of the plane.\n");


        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("south") || (input.equalsIgnoreCase("s") || (input.equalsIgnoreCase("go south")))) {
                if (currenRoom.getSouth() != null){
                    currenRoom = currenRoom.getSouth();
                    System.out.println("Going South");
                    System.out.println("You are now " + currenRoom);
            } else {
                System.out.println("You changed your mind");
            }
            }
            if (input.equalsIgnoreCase("north") || (input.equalsIgnoreCase("n") || (input.equalsIgnoreCase("go north")))) {
                if (currenRoom.getNorth() != null){
                    currenRoom = currenRoom.getNorth();
                    System.out.println("Going North");
                    System.out.println("You are now " + currenRoom);
            } else {
                System.out.println("You changed your mind");
            }
            }
            if (input.equalsIgnoreCase("east") || (input.equalsIgnoreCase("e") || (input.equalsIgnoreCase("go east")))) {
                if (currenRoom.getEast() != null){
                    currenRoom = currenRoom.getEast();
                    System.out.println("Going East");
                    System.out.println("You are now " + currenRoom);
            } else {
                System.out.println("You changed your mind");
            }
            }
            if (input.equalsIgnoreCase("west") || (input.equalsIgnoreCase("w") || (input.equalsIgnoreCase("go west")))) {
                if (currenRoom.getWest() != null) {
                    currenRoom = currenRoom.getWest();
                    System.out.println("Going West");
                    System.out.println("You are now " + currenRoom);
                } else {
                    System.out.println("You changed your mind");
            }
            }
            if (currenRoom == room5) {
                System.out.println("You Won!\nTry another path");
                System.exit(1);
            }
            if (input.equalsIgnoreCase("exit")){
                System.out.println("Winners never quit, and quitters never win");
                System.exit(1);
            }
            if (input.equalsIgnoreCase("look")){
                System.out.println("You where hit by deja-vu\n" + "You are at " + currenRoom);
            }
            if (input.equalsIgnoreCase("help")){
                System.out.println("THIS IS YOUR COMMANDS:\nExit - Lets your exit the game\nLook - Repeats room description \nNorth - Moves north\nSouth - Moves south\nEast - Moves east\nWest - Moves west" );
            }
        }
    }
}