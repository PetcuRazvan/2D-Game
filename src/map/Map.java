package map;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;

import main.GamePanel;

public class Map {

    BufferedImage image;
    GamePanel gp;

    public Map(GamePanel gp) {
        this.gp = gp;

        getMapImage();
    }

    public void getMapImage() {
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/map/map.png"));
        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void draw(Graphics2D g2) {
        g2.drawImage(image, 0, 0, gp.screenWidth, gp.screenHeight, null);
    }
}
