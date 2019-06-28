import javax.swing.*;
import java.awt.*;

//https://stackoverflow.com/questions/8611268/java-creating-a-2d-tile-map-in-a-panel-using-graphics2d-rectangles

public class Map extends JPanel {

    public static final int NUM_ROWS = 15;
    public static final int NUM_COLS = 15;
    public static final int PREFERRED_GRID_SIZE_PIXELS = 10;

    private Tile tileGrid[][];


    public Map(){
        this.tileGrid = new Tile[NUM_ROWS][NUM_COLS];

        for(int i = 0; i < NUM_ROWS; i++){
            for(int j = 0; j < NUM_COLS; j++){
                this.tileGrid[i][j] = new Tile('@', Color.white);
            }
        }

        int preferredWidth = NUM_ROWS*PREFERRED_GRID_SIZE_PIXELS;
        int preferredHeight = NUM_COLS*PREFERRED_GRID_SIZE_PIXELS;
        setPreferredSize(new Dimension(preferredWidth,preferredHeight));
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        g.clearRect(0,0,getWidth(),getHeight());

        int rectWidth = getWidth()/ NUM_COLS;
        int rectHeight = getHeight()/NUM_ROWS;

        for(int i  = 0; i < NUM_ROWS; i++)
        {
            for(int j = 0; j < NUM_COLS; j++)
            {
                int x = i*rectWidth;
                int y = j*rectHeight;
                Tile currentTile = tileGrid[i][j];
                currentTile.setCharacter('@');
                currentTile.setColor(Color.orange);
                g.setColor(Color.white);
                g.fillRect(x,y,rectWidth,rectHeight);
                g.setColor(currentTile.getColor());
                g.setFont(new Font("TimesRoman", Font.PLAIN,50));
                // 35 is a magic number, but it seems to get the job done, so let's ignore it.
                g.drawString((String.valueOf(currentTile.getCharacter())),x,y+(35));
            }
        }
    }

    public void setTileAtCoords(Coords coords, Tile tile)
    {
        this.tileGrid[coords.x][coords.y]=tile;
    }

    
}
