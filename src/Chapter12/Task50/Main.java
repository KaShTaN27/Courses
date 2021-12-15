package Chapter12.Task50;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "Wake up, son! You're learning Java!"));
        locations.put(1, new Location(1, "You're in the center of Town Lida. You're welcome!"));
        locations.put(2, new Location(2, "You enjoy the weather in the city park"));
        locations.put(3, new Location(3, "You feed the swans on the lake"));
        locations.put(4, new Location(4, "You are on the mound of Glory, equipped with alleys"));
        locations.put(5, new Location(5, "You're walking near the Lida's castle and hearing tourist gid"));
        locations.put(6, new Location(6, "You are at the station, see you soon"));

        locations.get(1).addExit("N", 5);
        locations.get(1).addExit("W", 4);
        locations.get(1).addExit("S", 2);
        locations.get(1).addExit("Q", 0);

        locations.get(2).addExit("W", 3);
        locations.get(2).addExit("N", 1);
        locations.get(2).addExit("Q", 0);

        locations.get(3).addExit("N", 4);
        locations.get(3).addExit("E", 2);
        locations.get(3).addExit("Q", 0);

        locations.get(4).addExit("S", 3);
        locations.get(4).addExit("E", 1);
        locations.get(4).addExit("Q", 0);

        locations.get(5).addExit("S", 1);
        locations.get(5).addExit("E", 6);
        locations.get(5).addExit("Q", 0);

        locations.get(6).addExit("W", 5);
        locations.get(6).addExit("Q", 0);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("QUIT", "Q");
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("WEST", "W");
        vocabulary.put("EAST", "E");

        int userChoice = 1;
        while (true) {
            System.out.println(locations.get(userChoice).getDescription());
            if (userChoice == 0)
                break;
            Map<String, Integer> exits = locations.get(userChoice).getExits();
            System.out.print("Exits: ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if (direction.length() > 1) {
                String[] words = direction.split(" ");
                for (String word : words)
                    if (vocabulary.containsKey(word)) {
                        direction = vocabulary.get(word);
                        break;
                    }
            }

            if (exits.containsKey(direction))
                userChoice = exits.get(direction);
            else
                System.out.println("You can't go in that direction");
        }

    }
}
