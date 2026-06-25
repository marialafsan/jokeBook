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

        JokeManager manager = new JokeManager();
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(manager, scanner);
        manager.addJoke("Why do developers prefer dark mode? - Because light attracts bugs!");
        manager.addJoke(" I changed my password to 'incorrect' - Whenever I forget it, the computer tells me: 'Your password is incorrect'");
        manager.addJoke("Why do Java developers wear glasses? - Because they can't C# !!");
        manager.addJoke("An SQL query walks into a bar, walks up to two tables, and asks: 'Can I JOIN you?'");
        manager.addJoke("There are 10 types of people in the world - Those who understand binary, and those who don't");
        manager.addJoke("How many programmers does it take to change a light bulb? - None, that's a hardware problem");
        ui.start();

    }
}
