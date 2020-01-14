import java.util.ArrayList;
import org.newdawn.slick.*;
import org.newdawn.slick.geom.Rectangle;

public class mainCharacter {

    SpriteSheet sprite;
    Animation ani;
    Image walk[] = new Image[2];
    private Rectangle hitbox;

    public mainCharacter(int x, int y) throws SlickException {
        sprite = new SpriteSheet("images/mainCharacter.png", 50, 66);
        sprite.startUse();
        for (int i = 0; i < 2; i++) {
            walk[i] = sprite.getSubImage(i, 0);
        }
        ani = new Animation(walk, 200);
        hitbox = new Rectangle(x, y, 50, 66);
    }

    public boolean isHitting(ArrayList<Rectangle> rect) {
        for (Rectangle r : rect) {
            if (hitbox.intersects(r)) {
                return true;
            }
        }
        return false;
    }

    public void draw() {
        ani.draw(hitbox.getX(), hitbox.getY());
    }
}