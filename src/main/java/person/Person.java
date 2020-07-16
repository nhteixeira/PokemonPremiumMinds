package person;

import field.Direction;
import field.Position;
import field.ActivePosition;

public class Person {

    private final Position position;
    private ActivePosition activePosition;
    private final String name;
    private int pokemonCatches;

    public Person(String name){
        this.name = name;
        this.activePosition = new ActivePosition(0, 0);
        this.position = new Position(0, 0);
        incrementPokemonCatches();
    }

    public Position getPosition() {
        return position;
    }

    public ActivePosition getActivePosition() {
        return activePosition;
    }

    public void setActivePosition(ActivePosition activePosition) {
        this.activePosition = activePosition;
    }

    public String getName() {
        return name;
    }

    public int getPokemonCatches() {
        return pokemonCatches;
    }

    public void setPokemonCatches(int pokemonCatches) {
        this.pokemonCatches = pokemonCatches;
    }

    public void moveInDirection(Direction direction) {
        switch (direction) {
            case N:
                moveUp();
                break;
            case S:
                moveDown();
                break;
            case O:
                moveLeft();
                break;
            case E:
                moveRight();
                break;
        }
    }

    public void moveUp(){
        this.activePosition = new ActivePosition(this.activePosition.getX(), this.activePosition.getY()+1);
        actualizePosition(activePosition);
        if(verifyIfPositionHasPokemon()){
            incrementPokemonCatches();
        }
    }

    public void moveDown(){
        this.activePosition = new ActivePosition(this.activePosition.getX(), this.activePosition.getY()-1);
        actualizePosition(activePosition);
        if(verifyIfPositionHasPokemon()){
            incrementPokemonCatches();
        }
    }

    public void moveLeft(){
        this.activePosition = new ActivePosition(this.activePosition.getX()-1, this.activePosition.getY());
        actualizePosition(activePosition);
        if(verifyIfPositionHasPokemon()){
            incrementPokemonCatches();
        }
    }

    public void moveRight(){
        this.activePosition = new ActivePosition(this.activePosition.getX()+1, this.activePosition.getY());
        actualizePosition(activePosition);
        if(verifyIfPositionHasPokemon()){
            incrementPokemonCatches();
        }
    }

    public void actualizePosition(ActivePosition activePosition){
        this.position.setX(activePosition.getX());
        this.position.setY(activePosition.getY());
    }

    public boolean verifyIfPositionHasPokemon(){
        return position.hasPokemon();
    }

    public void incrementPokemonCatches(){
        this.position.addNoPokemonPosition(activePosition);
        this.pokemonCatches++;
    }
}
