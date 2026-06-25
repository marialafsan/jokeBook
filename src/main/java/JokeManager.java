import java.util.*;

public class JokeManager {

    private ArrayList<String> jokeBook;

    public JokeManager(){
        this.jokeBook = new ArrayList<>();
    }

    public void addJoke (String joke){
        jokeBook.add(joke);
    }

    public String drawJokes (){

        if (jokeBook.isEmpty()) {
            return ("No jokes! No kidding!");

        } else {
            Random draw = new Random();
            int index = draw.nextInt(jokeBook.size());
            return (jokeBook.get(index));
        }
    }

    public void printJokes (){

        if (jokeBook.isEmpty()) {
            System.out.println("No jokes! No kidding!");

        } else {
            System.out.println(jokeBook);
        }
    }
}
