
import java.util.ArrayList;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;

public class introGuy {

    private Animation ani[] = new Animation[3];
    private Image walk[][] = new Image[3][3];
    private Image stopImage[] = new Image[3];
    private SpriteSheet guy;
    int guyx = 100, guyy = 100;
    private boolean stopped;
    private int dir;

    public introGuy(int x, int y) throws SlickException {
        guy = new SpriteSheet("images/introSpriteCharacter.png", 96, 96);
        guy.startUse();
        for (int i = 0; i < 3; i++) {
            stopImage[i] = guy.getSubImage(i, 0);
            for (int j = 0; j < 3; j++) {
                walk[i][j] = guy.getSubImage(i, j);
            }
            ani[i] = new Animation(walk[i], 100);
        }
        guy.endUse();
    }

    public void move(Input in, ArrayList<Rectangle> walls) {
        stopped = false;
        if (in.isKeyDown(Input.KEY_RIGHT)) {
            guyx++;
            dir = 3;
        } else if (in.isKeyDown(Input.KEY_LEFT)) {
            guyx--;
            dir = 1;
        } else if (in.isKeyDown(Input.KEY_DOWN)) {
            guyy++;
            dir = 0;
        } else if (in.isKeyDown(Input.KEY_UP)) {
            guyy--;
            dir = 2;
        } else {
            stopped = true;
        }
    }

    public void draw() {
        if (stopped) {
            ani[dir].stop();
            stopImage[dir].draw(guyx, guyy);
        } else {
            ani[dir].start();
            ani[dir].draw(guyx, guyy);
        }
    }
}
