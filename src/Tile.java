import java.awt.*;
import java.util.Objects;

public class Tile {

    public Tile(char character, Color color){
        this.character = character;
        this.color = color;
    }

    public char getCharacter() {
        return character;
    }

    public void setCharacter(char character) {
        this.character = character;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private char character;
    private Color color;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tile tile = (Tile) o;
        return character == tile.character &&
                Objects.equals(color, tile.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(character, color);
    }
}
