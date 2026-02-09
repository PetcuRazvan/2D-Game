package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class OBJ_Key extends SuperObject{

    public OBJ_Key() {
        name = "Rusted Key";

        try {
            image = ImageIO.read(getClass().getResourceAsStream("/objects/rusted_key.png"));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
