import java.util.*;

/**
 * Starting point of the project. Right now it displays a use of the JokeManager class to try its functionalities
 *
 * @author Maria Lafuente
 * @version 1.0
 * @since 1.0
 */

public class Main {

    public static void main (String[] args) {

        // TESTS: Trying out generating jokes from the main
        Scanner scanner = new Scanner (System.in);

        JokeManager manager = new JokeManager();
        manager.addJoke("What is red and smells of blue paint? - Red paint.");
        manager.addJoke("What is blue and smells of red paint? - Blue paint.");

        System.out.println("Drawing jokes:");
        for (int i = 0; i < 5; i++) {
            System.out.println(manager.drawJokes());
        }

        System.out.println("");
        System.out.println("Printing jokes:");
        manager.printJokes();

    }
}
