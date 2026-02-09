package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_BasementDoor extends SuperObject{

    public OBJ_BasementDoor() {
        name = "Wooden door";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/basement_door.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
