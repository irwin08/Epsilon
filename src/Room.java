import java.util.HashMap;

public class Room {
    private HashMap<Coords, Tile> tiles = new HashMap<>();
    private HashMap<Coords, ExitTile> exitTiles = new HashMap<>();

    public Tile getTileAtCoords(Coords coords){
        return tiles.get(coords);
    }

    public void setTileAtCoords(Coords coords, Tile tile){
        tiles.put(coords, tile);
    }
}
