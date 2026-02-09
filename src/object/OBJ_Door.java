package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Door extends SuperObject{

    public OBJ_Door() {
        name = "Wooden Door";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/wooden_door.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
