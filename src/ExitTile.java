import java.awt.*;
import java.util.Objects;

public class ExitTile extends Tile {

    public ExitTile(char c, Color color){
        super(c,color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExitTile exitTile = (ExitTile) o;
        return exit == exitTile.exit &&
                Objects.equals(exitTo, exitTile.exitTo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(exit, exitTo);
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    public Room getExitTo() {
        return exitTo;
    }

    public void setExitTo(Room exitTo) {
        this.exitTo = exitTo;
    }

    boolean exit;
    Room exitTo;
}
