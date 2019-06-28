import javax.swing.*;

public class MapBuilder {

    public static void main(String[] args) {
        MapBuilder mb = new MapBuilder();
        mb.startup();

    }

    private void startup() {
        JFrame frame = new JFrame("Map Builder");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        Map map = new Map();
        //map.setTileAtCoords(new Coords(0,0), new Tile('@', Color.orange));


        frame.add(map);
        frame.setVisible(true);
    }

}

