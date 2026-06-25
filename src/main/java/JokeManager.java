import java.util.*;

/**
 * Creation of a jokebook through the use of an Arraylist of Strings.
 *
 * Features: Can display a random joke from the lot
 * Features: Can add new jokes to the catalog
 * Features: Can display (a preview of -future implementation) the jokes already on it
 *
 * @author Maria Lafuente
 * @version 1.0
 * @since 1.0
 */

public class JokeManager {

    private ArrayList<String> jokeBook;

    public JokeManager(){
        this.jokeBook = new ArrayList<>();
    }

    /**
     * Adds a String to the Arraylist jokeBook
     * @param joke
     */

    public void addJoke (String joke){
        jokeBook.add(joke);
    }

    /**
     * Draws a random joke from the Arraylist
     * @return a String, or the intended joke or an error message if it's empty
     */

    public String drawJokes (){

        if (jokeBook.isEmpty()) {
            return ("No jokes! No kidding!");

        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokeBook.size());
            return (jokeBook.get(index));
        }
    }

    /**
     * Prints a three word preview of the jokes saved
     * Divides the jokes by words using the spaces and prints the first 3 words of each
     */
    public void printJokes (){

        if (jokeBook.isEmpty()) {
            System.out.println("No jokes! No kidding!");

        } else {
            int index = 1;

            for (String joke:jokeBook){

                String[] preview = joke.split(" ");
                System.out.print(index + ". ");

                for (int i = 0; i<3; i++){
                    if(!(preview[i].isEmpty())){
                        System.out.print(preview[i] + " ");
                    }
                }
                System.out.println("...");
                index++;
            }
        }
    }
}
