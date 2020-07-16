package io;

import field.Direction;
import person.Person;

import java.util.Scanner;

public class IOHandler {

    public String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void printOutput(int PokemonCatches){
        System.out.println(PokemonCatches);
    }

    public void manageInput(String userInput, Person person){
        try {
            for(int i = 0; i < userInput.length(); i++){
                person.moveInDirection(Direction.valueOf(String.valueOf(userInput.charAt(i))));
            }
        } catch (IllegalArgumentException e){
            System.out.println("Invalid characters. Valid characters are N, S, E or O and they are case sensitive.");
            e.getMessage();
        }

    }
}
