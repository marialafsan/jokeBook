import java.util.Scanner;

public class UserInterface {

    private JokeManager jokes;
    private Scanner scanner;

    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }

    public void menu(){

        System.out.println("===============");
        System.out.println(" --Joke Book-- ");
        System.out.println("===============");
        System.out.println("  menu  ");
        printLine();
        System.out.println("1 - add a joke");
        System.out.println("2 - draw a random joke");
        System.out.println("3 - list jokes");
        System.out.println("4 - show the menu");
        System.out.println("X - exit");

    }

    public void printLine(){
        System.out.println("---------");
    }

    public void start (){

        String word;
        String input;
        this.menu();

        while (true) {

            printLine();
            System.out.println("Write your command: ");
            word = scanner.nextLine();

            if (word.equalsIgnoreCase("x")) {
                System.out.println("Bye, bye!");
                break;

            } else if (word.equals("1")){
                System.out.println("Enter a joke in one line: ");
                input = scanner.nextLine();

                // user can cancel the input of jokes through "x" or "exit"
                if(!(input.equalsIgnoreCase("x") || input.equalsIgnoreCase("exit"))){
                    this.jokes.addJoke(input);
                }

            } else if (word.equals("2")){
                System.out.println(jokes.drawJokes());

            } else if (word.equals("3")){
                jokes.printJokes();

            } else if (word.equals("4") || word.equalsIgnoreCase("menu")) {
                this.menu();

            } else {
                System.out.println("Enter a valid command.");

            }

        }
    }
}
