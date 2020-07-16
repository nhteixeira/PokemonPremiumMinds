package field;

import java.util.ArrayList;

public class Position {
    private int x;
    private int y;
    private final ArrayList<Position> listOfPositionsWithNoPokemon;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
        this.listOfPositionsWithNoPokemon = new ArrayList<>();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Position> getListOfPositionsWithNoPokemon() {
        return listOfPositionsWithNoPokemon;
    }

    public void addNoPokemonPosition(Position position){
        listOfPositionsWithNoPokemon.add(position);
    }

    public boolean hasPokemon(){
        for (Position value : listOfPositionsWithNoPokemon) {
            if (value.getX() == this.x &&
                    value.getY() == this.y) {
                return false;
            }
        }
        return true;
    }
}
