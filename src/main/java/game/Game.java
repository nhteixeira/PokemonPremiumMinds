package game;

import io.IOHandler;
import person.Person;

public class Game {

    private final IOHandler IOHandler;
    private final Person person;

    public Game(){
        IOHandler = new IOHandler();
        person = new Person("Ash");
    }

    public io.IOHandler getIOHandler() {
        return IOHandler;
    }

    public Person getPerson() {
        return person;
    }

    public void start(){
        System.out.println("Enter coords (Valid options: N, S, E, O)");
        String userInput = IOHandler.getInput();
        IOHandler.manageInput(userInput, this.person);
        IOHandler.printOutput(person.getPokemonCatches());
    }
}
